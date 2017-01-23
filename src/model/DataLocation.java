/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author GIGABYTE
 */
public enum DataLocation {
    user("User","src/xml/user.xml");
    
    
    String name;
    String location;
    DataLocation(String n, String l){
        name = n;
        location = l;
    }
    
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
}
