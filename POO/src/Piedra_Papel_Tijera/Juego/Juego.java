package Piedra_Papel_Tijera.Juego;

import java.util.Scanner;

public class Juego implements Interfaz  {

    private int COM;
    private String Nombre;
    private String Jugada;
    private double Apuesta = 100000;
    private char letra;



    Scanner Entrada = new Scanner(System.in);

    //Solicitar los datos
    public void Inicio(){
        System.out.println("Ingrese su nombre");

        System.out.print("Nombre: "); Nombre = Entrada.nextLine();

        System.out.println("favor Ingresar su Jugada");

        System.out.println("Rock");
        System.out.println("papel");
        System.out.println("Tijera");
        System.out.println("Si pierde se le restan $10.000 a su acumulado, si gana se le suman");

        //Numero random para sacar la jugada de la computadora
        COM = (int) (Math.random() *3)+1;

        System.out.print("Jugada: "); Jugada = Entrada.nextLine();

        //Se captura la orimera letra de la jugada
        letra = Jugada.charAt(0);
    }
    public void Game_1(){
        switch (letra) {

            //Jugada Rock en minuscula y mayuscula para evitar errores en el sistema
            case 'R':
            case 'r': 

                //Se compara la jugada de la computadora, si gana la persona o la computadora
                switch (COM){
                    case 1: 
                     //Se menciona que el jugador empata
                     System.out.println("Jugador: "+Nombre+" Empato Contra la COM y no gana ni pierde dinero"); 
                        break;
                    case 2: 
                     //Se menciona que el jugador pierde
                     System.out.println("Jugador: "+Nombre+" perdio Contra la COM");
                            
                            Apuesta = Apuesta - 10000;

                        break;
                    case 3: 
                    //Se menciona que el jugador gana
                    System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 
                            //Se le suma 10000 al jugador por ganar la partida
                            Apuesta = Apuesta + 10000;
                            //Se cierra el caso
                            break;
                }

                    break;


                case 'P':
                case 'p': 
    
                    switch (COM){
                        case 1: System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 

                        Apuesta = Apuesta + 10000; 
                            break;
                        case 2: System.out.println("Jugador: "+Nombre+" Empato Contra la COM y no gana ni pierde dinero"); 
 
                            break;
                        case 3:  System.out.println("Jugador: "+Nombre+" perdio Contra la COM");
                        Apuesta = Apuesta - 10000; 
                            break;
                    }

                        break;


                case 'T':
                case 't': 
        
                        switch (COM){
                            case 1:  System.out.println("Jugador: "+Nombre+" perdio Contra la COM");
                            
                            Apuesta = Apuesta - 10000; 
                                break;
                            case 2: System.out.println("Jugador: "+Nombre+" Gano contra la COM"); 

                            Apuesta = Apuesta + 10000; 
                                break;
                            case 3: System.out.println("Jugador: "+Nombre+" Empato Contra la COM y no gana ni pierde dinero"); 
 
                                break;
                        }

                        break;

                default: 

                        System.out.println("Valor Incorrecto");

                        break;
        }
        
            //Se muestra El dinero total ganado al final de la jugada
            System.out.println("Su valor actual de dinero es: "+Apuesta);

            Entrada.close();
    
}

}
