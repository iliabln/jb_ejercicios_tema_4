package com.company;

public class SmartDevice {

    String brandName;
    String modelo;
    String sistemaOperativo;
    double tamanoPantalla;
    int almacenamiento;
    int ram;

    public SmartDevice() {
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brandName='" + brandName + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamanoPantalla=" + tamanoPantalla +
                ", almacenamiento=" + almacenamiento +
                ", ram=" + ram +
                '}';
    }

    public SmartDevice(String brandName, String modelo, String sistemaOperativo, double tamanoPantalla, int almacenamiento, int ram) {
        this.brandName = brandName;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.almacenamiento = almacenamiento;
        this.ram = ram;


    }

}
