package com.poo_paradigmas.abstraccion;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo", 5);

        Rectangulo rectangulo = new Rectangulo("Rectanglo", 4, 5);

        circulo.mostrarInformacion();
        rectangulo.mostrarInformacion();
    }
}
