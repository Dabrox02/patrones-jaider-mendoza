package com.local;

public class SmartPhoneAdapter implements DispositivoManipulacionTV {

    private SmartPhone smartPhone;

    public SmartPhoneAdapter() {
        this.smartPhone = new SmartPhone();
    }

    public SmartPhone getSmartPhone() {
        return this.smartPhone;
    }

    public void setSmartPhone(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public void encender() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivos();
        smartPhone.iniciarDispositivo();
    }

    @Override
    public void apagar() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivos();
        smartPhone.detenerDispositivo();
    }

    @Override
    public void manipularVolumen() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivos();
        smartPhone.manipularVolumen();
    }

    @Override
    public void cambiarEntrada() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivos();
        smartPhone.cambiarEntrada();
        ;
    }

}
