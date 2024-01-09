package com.local;

public class Main {
    public static void main(String[] args) {
        DispositivoManipulacionTV panelTV = new PanelTV();
        DispositivoManipulacionTV control = new ControlInfrarrojo();
        DispositivoManipulacionTV smartPhone = new SmartPhoneAdapter();

        System.out.println("===========");
        panelTV.encender();
        System.out.println("===========");
        panelTV.apagar();
        System.out.println("===========");
        panelTV.manipularVolumen();
        System.out.println("===========");
        panelTV.cambiarEntrada();

        System.out.println("===========");
        control.encender();
        System.out.println("===========");
        control.apagar();
        System.out.println("===========");
        control.manipularVolumen();
        System.out.println("===========");
        control.cambiarEntrada();

        System.out.println("===========");
        smartPhone.encender();
        System.out.println("===========");
        smartPhone.apagar();
        System.out.println("===========");
        smartPhone.manipularVolumen();
        System.out.println("===========");
        smartPhone.cambiarEntrada();
    }
}