//Paquete de la Clase
package Salud_2;

//Improtacion de la Clase Scanner
import java.util.Scanner;

//Creacion de la Clase
public class Persona{

    //Declaracion de Variables
   private int numDoc, edad;
   private String Nombre, Apellido, sexo;
   private double pesoIMC;
   public int peso;
   public int estatura;

//Creacion del metodo para solicitar datos
    public void pedirDatos(){

        //Instancia de la clase Scanner 
        Scanner Entrada  = new Scanner(System.in);

        //Se solicitan datos
        System.out.println("Ingrese a continuacion los siguientes Datos");

        System.out.print("Ingrese su numero de documento "); numDoc=Entrada.nextInt();
        
        System.out.print("ingrese su nombre "); Nombre=Entrada.next();

        System.out.print("ingrese su apellido "); Apellido=Entrada.next();

        System.out.print("Ingrese Estatura "); estatura=Entrada.nextInt();

        System.out.print("Ingrese peso "); peso=Entrada.nextInt();
        
        System.out.print("Ingrese Edad "); edad=Entrada.nextInt();
        
        System.out.print("Ingrese Sexo "); sexo=Entrada.next();
        
        //Se limpia el Buffer
        Entrada.close();


    }

    //Creacion del Metodo IMC Donde se calcula el indice de masa corporal
    public int calcularIMC(){
       
	pesoIMC=peso/(estatura * estatura);

    return (int) pesoIMC;
     
}
    
        public void mostrarDatos(){

        if (pesoIMC<20) {
            System.out.println("Buen Peso");

        }else if (pesoIMC>20 && pesoIMC<25){
            System.out.println("Peso Correcto");
            
        }else if (pesoIMC>26) {
            System.out.println("Sobre Peso");
        }

            System.out.println("Su numero de documento es: " +numDoc);
            System.out.println("Su Nombre es: " +Nombre+" y su Apellido es: "+Apellido);
            System.out.println("Su peso actual es: " +peso);
            System.out.println("Su sexo es: " +sexo);
            System.out.println("Su estatura actual es: " +estatura);
            System.out.println("Su edad actual es: " +edad);
            System.out.println("Su IMC actual es: " +pesoIMC);
          }

        //Creacion del Metodo para Validar si es mayor o menor de Edad
        public void Edad(){
        if(edad>=18){
        System.out.println("Es mayor de Edad");
        }else if(edad<18){
        System.out.println("Es menor de Edad");

        	}

        }
    }

