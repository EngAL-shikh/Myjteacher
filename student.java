package com.example.myteacher;

public class student {
    String id;
    String UserName;
    String Password;
    String email;
    String FName;
    String LName;
    String Educational_level;

    public student(String id, String userName, String password, String email, String FName, String LName, String educational_level) {
        this.id = id;
        UserName = userName;
        Password = password;
        this.email = email;
        this.FName = FName;
        this.LName = LName;
        Educational_level = educational_level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEducational_level() {
        return Educational_level;
    }

    public void setEducational_level(String educational_level) {
        Educational_level = educational_level;
    }
}
