package com.company;

public class SmartPhone extends SmartDevice {

    boolean faceUnlock;
    boolean fiveG;

    public SmartPhone() {
    }

    public SmartPhone(String brandName, String modelo, String sistemaOperativo, double tamanoPantalla, int almacenamiento, int ram, boolean faceUnlock, boolean fiveG) {
        super(brandName, modelo, sistemaOperativo, tamanoPantalla, almacenamiento, ram);
        this.faceUnlock = faceUnlock;
        this.fiveG = fiveG;
    }
}
