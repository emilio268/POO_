package Empleado.Salud;
import java.util.Scanner;
public class persona {


    public int numDoc, edad;
    public String Nombre, Apellido, sexo;
    public static double pesoIMC;
    public int peso;
    public int estatura;
    
    public persona(int numDoc, String Nombre, 
                    String Apellido, int peso, int estatura, 
                    int edad, String sexo) {

        this.numDoc = numDoc;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public persona() {
    }

    public void pedirDatos(){

        Scanner Entrada  =new Scanner(System.in);

        System.out.println("Ingrese a continuacion los siguientes Datos");

        System.out.print("Ingrese su numero de documento "); numDoc=Entrada.nextInt();
        
        System.out.print("ingrese su nombre "); Nombre=Entrada.next();

        System.out.print("ingrese su apellido "); Apellido=Entrada.next();

        System.out.print("Ingrese Estatura "); estatura=Entrada.nextInt();

        System.out.print("Ingrese peso "); peso=Entrada.nextInt();
        
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


    
    public int getDocumento() {
        return numDoc;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getEstatura() {
        return estatura;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getSexo() {
        return sexo;
    }

    
    public void setDocumento(int numDoc) {
        this.numDoc = numDoc;
    }
    
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void mostrarPersona() {

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
        }

