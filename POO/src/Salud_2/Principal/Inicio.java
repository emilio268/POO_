//Paquete de la Clase
package Salud_2.Principal;

//Se importa la clase persona del paquete Salud
import Salud.Persona;

//Creacion de la Clase 
public class Inicio {

    //Metodo Main para la ejecucion
    public static void main(String[] args) {

        //Instancia de un nuevo objeto
       Persona objeto = new Persona();

       //Invocamos metodos de la clase
        objeto.pedirDatos();
        objeto.mostrarDatos(); 
        objeto.Edad();        

    }
}
