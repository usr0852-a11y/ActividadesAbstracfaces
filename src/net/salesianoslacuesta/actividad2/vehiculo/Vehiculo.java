package net.salesianoslacuesta.actividad2.vehiculo;

public abstract class Vehiculo {
    protected String color;
    protected int numeroPuertas;
    protected int numeroRuedas;
    protected String modelo;
    protected String matricula;

    public Vehiculo(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }
}
