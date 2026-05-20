package net.salesianoslacuesta.actividad2.cocheCombustion;

public class CocheCombustion extends Vehiculo {

     private boolean motorEncendido;
     private double listrosCombustible;

     public CocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula, double listrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.listrosCombustible = listrosCombustible;
        this.motorEncendido = false;
     }

     // Getters

     public boolean getMotorEncendido() {
        return motorEncendido;
     }

     public double getLitrosCombustible() {
        return listrosCombustible;
     }

     // Setters

     public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
     }

     public void setLitrosCombustible(double listrosCombustible) {
        this.listrosCombustible = listrosCombustible;
     }
}