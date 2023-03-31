package Figuras_geometricas.Ejecucion;

import java.util.Scanner;

import Figuras_geometricas.Figuras_Clases.Circulo;
import Figuras_geometricas.Figuras_Clases.Rectangulo;
import Figuras_geometricas.Figuras_Clases.Triangulo;

public class Ejecucion {

    public static void main(String[] args) {

        String opcion;
        char letra;
        
        Scanner Entrada = new Scanner(System.in);

            System.out.println("Area del Triangulo");

            System.out.println("Area del Rectángulo");

            System.out.println("Area del Circulo");

            System.out.println("Salir");


            System.out.print("Operacion: "); opcion = Entrada.next();

            letra = opcion.charAt(0);
           
            do{

            switch (letra) {

                case 'T':
                case 't':

                    System.out.println("Base del Triangulo: "); double baseTriangulo = Entrada.nextDouble();

                    System.out.println("Altura del Triangulo: "); double alturaTriangulo = Entrada.nextDouble();

                    
                    Triangulo objeto = new Triangulo(baseTriangulo, alturaTriangulo);

                    System.out.println("El área del Triángulo Es de: "+ objeto.op());

                    break;

                case 'R':

                case 'r':

                    System.out.print("Base Rectangulo : "); double baseRectangulo = Entrada.nextDouble();

                    System.out.print("Altura Rectangulo : "); double alturaRectangulo = Entrada.nextDouble();

                    Rectangulo objeto_1 = new Rectangulo(baseRectangulo, alturaRectangulo);

                    System.out.println("El área del Rectangulo Es de: "+ objeto_1.op());

                    break;


                case 'C':

                case 'c':

                    System.out.print("Radio Circulo: "); double radioCirculo = Entrada.nextDouble();

                    Circulo objeto_2 = new Circulo(radioCirculo);

                    System.out.println("El área del Círculo es: " + objeto_2.op());

                    break;

                default:

                    System.out.println("Gracias por usar el Software");

            }

        }while(opcion !=  "s".toUpperCase());
                     
        
        Entrada.close();
    }
    }

