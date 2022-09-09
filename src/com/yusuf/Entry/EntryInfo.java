package com.yusuf.Entry;

import com.yusuf.car.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EntryInfo {
    private String hgsNo;
    private String name;
    private String lastName;
    private Vehicle vehicle;

    private String transitionDate;
    private String transitionTime;

    private double balance;
    public EntryInfo(String hgsNo, String name, String lastName, Vehicle vehicle,double balance) {
        this.hgsNo = hgsNo;
        this.name = name;
        this.lastName = lastName;
        this.vehicle = vehicle;
        this.balance = balance;
    }
    public void transition(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date transitionDate = new Date();
        this.transitionDate = df.format(transitionDate);
        DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
        Date transitionTime = new Date();
        this.transitionTime = df2.format(transitionTime);
    }
    public String getHgsNo() {
        return hgsNo;
    }

    public void setHgsNo(String hgsNo) {
        this.hgsNo = hgsNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getTransitionDate() {
        return transitionDate;
    }

    public void setTransitionDate(String transitionDate) {
        this.transitionDate = transitionDate;
    }

    public String getTransitionTime() {
        return transitionTime;
    }

    public void setTransitionTime(String transitionTime) {
        this.transitionTime = transitionTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
