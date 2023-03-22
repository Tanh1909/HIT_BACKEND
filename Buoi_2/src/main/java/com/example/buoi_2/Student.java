package com.example.buoi_2;

public class Student {
    private String msv;
    private String name;
    private int age;

    public Student(String msv, String name, int age) {
        this.msv = msv;
        this.name = name;
        this.age = age;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
