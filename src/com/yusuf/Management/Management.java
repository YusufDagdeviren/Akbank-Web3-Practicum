package com.yusuf.Management;

public class Management {
    private double managementFinance;

    public Management() {
        this.managementFinance = 0;
    }

    public double getManagementFinance() {
        return managementFinance;
    }

    public void increaseBalance(double balance){
        managementFinance+=balance;
    }

}
