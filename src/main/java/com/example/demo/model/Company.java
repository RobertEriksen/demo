package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

    String address;
    String phoneNr;
    String cvr;
    ArrayList<Owner> owners;
    int profitability;

    public Company(String address, String phoneNr, String cvr, ArrayList<Owner> owners, int profitability) {
        this.address = address;
        this.phoneNr = phoneNr;
        this.cvr = cvr;
        this.owners = initializeOwners(owners);
        this.profitability = profitability;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public ArrayList<Owner> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<Owner> owners) {
        this.owners = owners;
    }

    private static ArrayList<Owner> initializeOwners(List<Owner> owners) {
        ArrayList<Owner> ownersTemp = new ArrayList();
        for (Owner owner : owners) {
            Owner newOwner = new Owner(owner.getName(), owner.getAddress(), owner.getCpr());
            ownersTemp.add(newOwner);
        }
        return ownersTemp;
    }

    public int getProfitability() {
        return profitability;
    }

    public void setProfitability(int profitability) {
        this.profitability = profitability;
    }
}
