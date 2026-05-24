package net.salesianoslacuesta.actividad2.cocheCombustion;

import net.salesianoslacuesta.actividad2.vehiculo.Vehiculo;

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

     @Override
     public void arrancar() {
        if (listrosCombustible >= 1) {
            listrosCombustible -= 1;
            motorEncendido = true;
            System.out.println("El coche arranco!. Combustible restante: "+ listrosCombustible + " litros.");

        } else {
            motorEncendido = false;
            System.out.println("No arranca!. No hay combustible suficiente.");
        }


     @Override
    public void pararMotor() {
        motorEncendido = false;
        System.out.println("El motor se ha detenido.");
    }
    
    @Override
    public void mover() {
        if (!motorEncendido) {
            System.out.println("No se puede mover ya que el motor está apagado.");
            pararMotor();
        } else if (listrosCombustible < 1) {
            System.out.println(" No se puede mover ya que no queda combustible suficiente.");
            pararMotor();
        } else {
            listrosCombustible -=1;
            System.out.println("El coche se está moviendo!. Combustible restante: " + listrosCombustible + "litros.");
        }   
    }

   
     }
}