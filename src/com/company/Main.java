package com.company;

public class Main {

    public static void main(String[] args) {

        SmartDevice iPad3 = new SmartDevice("Apple", "iPad Air", "iPad OS", 10.9, 128, 4);
        System.out.println(iPad3);

        SmartPhone iPhone12 = new SmartPhone("Apple", "iPhone 12", "iOS 15", 6.06, 128, 4, true, true);
        System.out.println(iPhone12);

        SmartWatch appleWatch = new SmartWatch("Apple", "Apple Watch", "WatchOs 8", 1.78, 16, 1, true, true);
        System.out.println(appleWatch);

    }
}
