package com.example.buoi_4;

public class User {
    private int ID;
    private String userName;
    private String passWord;
    public User(){

    }
    public User(int ID, String userName, String passWord) {
        this.ID = ID;
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
