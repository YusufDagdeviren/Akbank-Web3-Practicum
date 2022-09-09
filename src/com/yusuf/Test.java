package com.yusuf;



import com.yusuf.Counter.Counter;
import com.yusuf.Entry.EntryInfo;
import com.yusuf.Management.Management;
import com.yusuf.car.Bus;
import com.yusuf.car.Car;
import com.yusuf.car.MiniBus;
import com.yusuf.car.Vehicle;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String transactions = "1.HGS sistemine kayit ol\n" +
                          "2.Kullanici islemleri\n" +
                          "3.Yonetim islemleri\n" +
                          "4.Sistemden cikis";
        String userTransactions = "1.Hgs numarasi ogren\n" +
                                  "2.Arac turu ogren\n" +
                                  "3.Bakiye ogren\n" +
                                  "4.Giseden gec\n" +
                                  "5.Gise gecis tarihi ogren\n" +
                                  "6.Cikis";
        String managementTransactions = "1.Giseden gecen araclari ogren\n" +
                                        "2.Yonetim bakiyesi ogren\n" +
                                        "3.Cikis";
        Management management = new Management();
        Counter counter = new Counter();
        EntryInfo entry = null;
        Vehicle vehicle = null;
        while(true){
            System.out.println(transactions);
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice==1){
                System.out.println("Lutfen hgs numaranizi giriniz: ");
                String hgs = scanner.nextLine();
                System.out.println("Adiniz: ");
                String name = scanner.nextLine();
                System.out.println("Soyadiniz: ");
                String lastName = scanner.nextLine();
                System.out.println("Arac turunuz Araba(1),Minibus(2),Otobus(3)");
                int type = scanner.nextInt();
                scanner.nextLine();
                if(type==1){
                    vehicle = new Car();
                }else if(type==2){
                    vehicle = new MiniBus();
                }else if(type==3){
                    vehicle = new Bus();
                }else{
                    System.out.println("Lutfen dogru araba secimi yapiniz.");
                    continue;
                }
                System.out.println("Lutfen bakiye yukleyiniz: ");
                double balance = scanner.nextDouble();
                entry = new EntryInfo(hgs,name,lastName,vehicle,balance);
            }else if(choice==2){
                if(entry==null){
                    System.out.println("Lutfen kayit yapiniz...");
                    continue;
                }else{
                    while (true){
                        System.out.println(userTransactions);
                        int userChoice = scanner.nextInt();
                        scanner.nextLine();
                        if(userChoice==1){
                            System.out.println("Hgs numaraniz = "+entry.getHgsNo());
                        }else if(userChoice==2){
                            System.out.println("Araciniz = "+entry.getVehicle().getVehicleType());
                        }else if(userChoice==3){
                            System.out.println("Bakiyeniz = "+entry.getBalance());
                        }else if(userChoice==4){
                            counter.reduceBalance(entry,management);
                        }else if(userChoice==5){
                            if(entry.getTransitionDate()==null && entry.getTransitionTime()==null){
                                System.out.println("Giseden gecis yapmadiniz...");
                            }else{
                                System.out.println("Giseden gectiginiz tarih = "+entry.getTransitionDate()+"\n" +
                                        "Giseden gectiginiz saat = "+entry.getTransitionTime());
                            }
                        }else if(userChoice==6){
                            System.out.println("Kullanici ekranindan cikis yapiliyor...");
                            break;
                        }else{
                            System.out.println("Yanlis islem...");
                        }

                    }
                }

            }else if(choice==3){
                    while (true){
                        System.out.println(managementTransactions);
                        int managementChoice = scanner.nextInt();
                        scanner.nextLine();
                        if(managementChoice==1){
                            if(counter.getVehicleList().size()==0){
                                System.out.println("Bugun giseden arac gecmedi");
                            }else{
                                for(Vehicle vehicle1 : counter.getVehicleList()){
                                    System.out.println(vehicle1.getVehicleType());
                                }
                            }
                        }else if(managementChoice==2){
                            System.out.println("Yonetim bakiyesi= "+management.getManagementFinance());
                        }else if(managementChoice==3){
                            System.out.println("Yonetim ekranindan cikis yapiliyor...");
                            break;
                        }else{
                            System.out.println("Yanlis islem");
                        }
                    }
            }else if(choice==4){
                System.out.println("Hgs sisteminden cikiliyor....");
                break;
            }else{
                System.out.println("Yanlis islem....");
            }

        }



    }
}
