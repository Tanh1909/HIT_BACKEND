package com.example.buoi3;

public class User {
    private String user;
    private String password;
    private String fullname;

    public User() {

    }

    public String getUser() {
        return user;
    }

    public User(String user, String password, String fullname) {
        this.user = user;
        this.password = password;
        this.fullname = fullname;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

}
