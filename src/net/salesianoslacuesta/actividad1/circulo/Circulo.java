package net.salesianoslacuesta.actividad1.circulo;

import net.salesianoslacuesta.actividad1.CalculoBidimencional;

public class Circulo implements CalculoBidimencional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}