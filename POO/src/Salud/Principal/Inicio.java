package Salud.Principal;

import Salud.Persona;

public class Inicio {

    public static void main(String[] args) {

       Persona objeto = new Persona();

        objeto.pedirDatos();
        objeto.mostrarDatos(); 
        objeto.IMC();
        objeto.Edad();
         

    }
}
