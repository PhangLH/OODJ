package util;


import model.DataLocation;
import model.Root;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

/**
 * Purely read and write the file, if file exist, will replace;
 */
public class Writer {
    JAXBContext jaxbContext;

    public Writer(Class... classes){
        try {
            jaxbContext = JAXBContext.newInstance(classes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(DataLocation data, Root root){
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            QName qName = new QName(data.getName());
            JAXBElement<Root> jaxbElement = new JAXBElement<Root>(qName,Root.class,root);
            marshaller.marshal(jaxbElement,new File(data.getLocation()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Object read(DataLocation data){
        try{
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StreamSource xml = new StreamSource(data.getLocation());
            return  unmarshaller.unmarshal(xml,Root.class).getValue();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
