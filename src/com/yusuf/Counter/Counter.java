package com.yusuf.Counter;

import com.yusuf.Entry.EntryInfo;
import com.yusuf.Management.Management;
import com.yusuf.car.Vehicle;

import java.util.ArrayList;

public class Counter {
    private ArrayList<Vehicle> vehicleList;

    public Counter() {
        vehicleList = new ArrayList<>();
    }
    public void reduceBalance(EntryInfo en,Management management){
        if(en.getVehicle().getVehicleType().equals("Car")){
            if(en.getBalance()<30){
                System.out.println("Yetersiz bakiye lutfen yukleme yapın bakiyeniz = "+en.getBalance());
            }else{
                en.setBalance(en.getBalance()-30);
                passingVehicle(en.getVehicle());
                en.transition();
                management.increaseBalance(30);
            }
        }else if(en.getVehicle().getVehicleType().equals("Minibus")){
            if(en.getBalance()<40){
                System.out.println("Yetersiz bakiye lutfen yukleme yapın bakiyeniz = "+en.getBalance());
            }else{
                en.setBalance(en.getBalance()-40);
                passingVehicle(en.getVehicle());
                en.transition();
                management.increaseBalance(40);
            }
        }else if(en.getVehicle().getVehicleType().equals("Bus")){
            if(en.getBalance()<50){
                System.out.println("Yetersiz bakiye lutfen yukleme yapın bakiyeniz = "+en.getBalance());
            }else{
                en.setBalance(en.getBalance()-50);
                passingVehicle(en.getVehicle());
                en.transition();
                management.increaseBalance(50);
            }
        }
    }
    public void passingVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

}
