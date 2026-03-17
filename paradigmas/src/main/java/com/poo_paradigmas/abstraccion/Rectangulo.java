package com.poo_paradigmas.abstraccion;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }
}