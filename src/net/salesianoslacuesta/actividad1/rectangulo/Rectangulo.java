package net.salesianoslacuesta.actividad1.rectangulo;

import net.salesianoslacuesta.actividad1.CalculoBidimencional;

public class Rectangulo implements CalculoBidimencional {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
