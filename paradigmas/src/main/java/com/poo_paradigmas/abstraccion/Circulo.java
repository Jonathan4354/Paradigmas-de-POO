package com.poo_paradigmas.abstraccion;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
    }
}