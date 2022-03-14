package com.company;

public class Main {

    public static void main(String[] args) {

        SmartDevice iPad3 = new SmartDevice("Apple", "iPad Air", "iPad OS", 10.9, 128, 4);
        System.out.println(iPad3.brandName);
        System.out.println(iPad3.modelo);
        System.out.println(iPad3.sistemaOperativo);
        System.out.println(iPad3.tamanoPantalla);
        System.out.println(iPad3.almacenamiento);
        System.out.println(iPad3.ram);

        SmartPhone iPhone12 = new SmartPhone("Apple", "iPhone 12", "iOS 15", 6.06, 128, 4, true, true);
        System.out.println(iPhone12.brandName);
        System.out.println(iPhone12.modelo);
        System.out.println(iPhone12.sistemaOperativo);
        System.out.println(iPhone12.tamanoPantalla);
        System.out.println(iPhone12.almacenamiento);
        System.out.println(iPhone12.ram);
        System.out.println(iPhone12.faceUnlock);
        System.out.println(iPhone12.fiveG);

        SmartWatch appleWatch = new SmartWatch("Apple", "Apple Watch", "WatchOs 8", 1.78, 16, 1, true, true);
        System.out.println(appleWatch.brandName);
        System.out.println(appleWatch.modelo);
        System.out.println(appleWatch.sistemaOperativo);
        System.out.println(appleWatch.tamanoPantalla);
        System.out.println(appleWatch.almacenamiento);
        System.out.println(appleWatch.ram);
        System.out.println(appleWatch.heartRateMonitor);
        System.out.println(appleWatch.altimeter);

    }
}
