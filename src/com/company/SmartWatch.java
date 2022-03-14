package com.company;

public class SmartWatch extends SmartDevice {

    boolean heartRateMonitor;
    boolean altimeter;

    public SmartWatch() {
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brandName='" + brandName + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamanoPantalla=" + tamanoPantalla +
                ", almacenamiento=" + almacenamiento +
                ", ram=" + ram +
                ", heartRateMonitor=" + heartRateMonitor +
                ", altimeter=" + altimeter +
                '}';
    }

    public SmartWatch(String brandName, String modelo, String sistemaOperativo, double tamanoPantalla, int almacenamiento, int ram, boolean heartRateMonitor, boolean altimeter) {
        super(brandName, modelo, sistemaOperativo, tamanoPantalla, almacenamiento, ram);
        this.heartRateMonitor = heartRateMonitor;
        this.altimeter = altimeter;
    }
}
