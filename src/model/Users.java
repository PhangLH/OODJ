package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users {
    private String UserID;
    private String Username;
    private String UserPassword;
    private String UserEmail;
    private String UserAuthority;
    private String Users_Name;

    
    public String getUserID() {return UserID;}
    public String getUsername() {return Username;}
    public String getUserPassword() {return UserPassword;}
    public String getUserEmail() {return UserEmail;}
    public String getUserAuthority() {return UserAuthority;}
    public String getUsers_Name() {return Users_Name;}

    
    public void setUserID(String UserID) {this.UserID = UserID;}
    public void setUsername(String Username) {this.Username = Username;}
    public void setUserPassword(String UserPassword) {this.UserPassword = UserPassword;}
    public void setUserEmail(String UserEmail) {this.UserEmail = UserEmail;}
    public void setUserAuthority(String UserAuthority) {this.UserAuthority = UserAuthority;}
    public void setUsers_Name(String Users_Name) {this.Users_Name = Users_Name;}
}
