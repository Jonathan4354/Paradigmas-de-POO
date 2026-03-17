package com.poo_paradigmas.abstraccion;

public abstract class Figura {

    protected String nombre;

    // Constructor
    public Figura(String nombre){
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Método abstracto (OBLIGA a las clases hijas)
    public abstract double calcularArea();

    // Método normal (puede ser reutilizado)
    public void mostrarInformacion(){
        System.out.println("Nombre de la Figura: " + nombre);
    }
}