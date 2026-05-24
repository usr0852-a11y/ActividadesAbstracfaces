import net.salesianoslacuesta.actividad1.calculoBidimencional.CalculoBidimencional;
import net.salesianoslacuesta.actividad1.circulo.Circulo;
import net.salesianoslacuesta.actividad1.rectangulo.Rectangulo;
import net.salesianoslacuesta.actividad2.cocheCombustion.CocheCombustion;
import net.salesianoslacuesta.actividad2.vehiculo.Vehiculo;

import java.util.Scanner;
import java.util.scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;

    do {
        System.out.println("Menú de actividades: ");
        System.out.println("1. Actividad 1: Figuras geométricas");
        System.out.println("2. Actividad 2: Coche de combustión");
        System.out.println("3. Salir");
        System.out.println("Escoge una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                //RECTANGULO
                System.out.println("Rectángulo:");
                System.out.println("Introduce la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.println("Introduce la altura del rectángulo: ");
                double altura = scanner.nextDouble();

                Rectangulo rectangulo = new Rectangulo(base, altura);

                System.out.println("Rectángulo creado!!");
                System.out.println("Base: " + rectangulo.getBase());
                System.out.println("Altura: " + rectangulo.getAltura());
                System.out.println("Área: " + rectangulo.calcularArea());
                System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

                System.out.println("Círculo:");
                System.out.println("Introduce el radio: ");
                double radio = scanner.nextDouble();
                
                Circulo circulo = new Circulo(radio);

                System.out.println("Círculo creado!!");
                System.out.println("Radio: " + circulo.getRadio());
                System.out.println("Área: "+ circulo.calcularArea()); 
                System.out.println("Perímetro: " + circulo.calcularPerimetro());

                break;
        
            default:
                break;
        }

    }
    }

    scanner.close();
}
