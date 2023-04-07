package com.example.buoi_4.Exception;

public class Null extends NullPointerException{
    private String message;
    public Null(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
