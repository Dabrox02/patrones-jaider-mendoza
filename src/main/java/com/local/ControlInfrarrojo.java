package com.local;

public class ControlInfrarrojo implements DispositivoManipulacionTV {

    @Override
    public void encender() {
        System.out.println("Encendiendo PanelTV");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando PanelTV");
    }

    @Override
    public void manipularVolumen() {
        System.out.println("Manipulando Volumen PanelTV");
    }

    @Override
    public void cambiarEntrada() {
        System.out.println("Cambiando entrada PanelTV");
    }

}
