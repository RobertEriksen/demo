package com.example.demo.model;

public class Owner {
    String name;
    String address;
    String cpr;


    public Owner(String name, String address, String cpr) {
        this.name = name;
        this.address = address;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
}
