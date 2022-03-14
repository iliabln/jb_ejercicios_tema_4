package com.company;

public class SmartWatch extends SmartDevice {

    boolean heartRateMonitor;
    boolean altimeter;

    public SmartWatch() {
    }

    public SmartWatch(String brandName, String modelo, String sistemaOperativo, double tamanoPantalla, int almacenamiento, int ram, boolean heartRateMonitor, boolean altimeter) {
        super(brandName, modelo, sistemaOperativo, tamanoPantalla, almacenamiento, ram);
        this.heartRateMonitor = heartRateMonitor;
        this.altimeter = altimeter;
    }
}
