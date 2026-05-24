import net.salesianoslacuesta.actividad1.calculoBidimencional.CalculoBidimencional;
import net.salesianoslacuesta.actividad1.circulo.Circulo;
import net.salesianoslacuesta.actividad1.rectangulo.Rectangulo;
import net.salesianoslacuesta.actividad2.cocheCombustion.CocheCombustion;
import net.salesianoslacuesta.actividad2.vehiculo.Vehiculo;

import java.util.Scanner;


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

            case 2:
                scanner.nextLine(); // Para no mezclarlo con la actividad 1

                System.out.println("Crear un coche de combustión: ");

                System.out.println("Color: ");
                String color = scanner.nextLine();

                System.out.println("Modelo: ");
                String modelo = scanner.nextLine();

                System.out.println("Matrícula: ");
                String matricula = scanner.nextLine();

                System.out.println("Número de puertas: ");
                int puertas = scanner.nextInt();

                System.out.println("Número de ruedas: ");
                int ruedas = scanner.nextInt();

                int litros = 20;

                CocheCombustion cocheCombustion = new CocheCombustion(color, puertas, ruedas, modelo, matricula, litros);
                System.out.println("Intentando mover el coche sin arrancar...");
                cocheCombustion.mover();

                System.out.println("Arrancando motor...");
                cocheCombustion.arrancar();

                System.out.println("Moviendo el coche varias veces...");
                cocheCombustion.mover();
                cocheCombustion.mover();
                cocheCombustion.mover();

                System.out.println("Combustible restante: " + cocheCombustion.getLitrosCombustible());

                System.out.println("Estableciendo combustible en 2 litros...");
                cocheCombustion.setLitrosCombustible(2);

                System.out.println("Moviendo el coche tres veces más...");
                cocheCombustion.mover();
                cocheCombustion.mover();
                cocheCombustion.mover();

                break;

            case 3:
                System.out.println("Saliendo del programa...");
                break;
        
            default:
                System.out.println("Opción no válida");
        }

    } while (opcion != 3);

        scanner.close();
    }

   
}
