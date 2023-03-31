package Salud;

import java.util.Scanner;

public class Persona {

    private int numDoc, edad;
    private String Nombre, Apellido, sexo;
    private double pesoIMC, peso, estatura;


    public void pedirDatos(){

        Scanner Entrada  =new Scanner(System.in);

        System.out.println("Ingrese a continuacion los siguientes Datos");

        System.out.print("Ingrese su numero de documento "); numDoc=Entrada.nextInt();
        
        System.out.print("ingrese su nombre "); Nombre=Entrada.next();

        System.out.print("ingrese su apellido "); Apellido=Entrada.next();

        System.out.print("Ingrese Estatura "); estatura=Entrada.nextDouble();

        System.out.print("Ingrese peso "); peso=Entrada.nextDouble();
        
        System.out.print("Ingrese Edad "); edad=Entrada.nextInt();
        
        System.out.print("Ingrese Sexo "); sexo=Entrada.next();
        
        Entrada.close();

    }

    public void mostrarDatos(){
      System.out.println("Su numero de documento es: " +numDoc);
      System.out.println("Su Nombre es: " +Nombre+" y su Apellido es: "+Apellido);
      System.out.println("Su peso actual es: " +peso);
      System.out.println("Su sexo es: " +sexo);
      System.out.println("Su estatura actual es: " +estatura);
      System.out.println("Su edad actual es: " +edad);
    
    }
    public void IMC(){
       
	pesoIMC=peso/(estatura * estatura);
       
       if(pesoIMC<20){
        System.out.println("El peso es bajo ");

       }else if(pesoIMC>=20){
        System.out.println("El peso es Correcto");
       }else if(pesoIMC>25){
        System.out.println("Su peso es muy alto");
       }

        }
        public void Edad(){
        if(edad>=18){
        System.out.println("Es mayor de Edad");
        }else if(edad<18){
        System.out.println("Es menor de Edad");

        	}
        }

        public void calcularImc() {
        }
    }

