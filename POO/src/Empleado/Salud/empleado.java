package Empleado.Salud;
import java.util.Scanner;

public class empleado extends persona {

    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    private double RETEICA = 0.00966;
    private double honor_1;
    
    public void pedirDatosEmpleado() {

        System.out.println("Ingrese los siguientes Datos");

        Scanner Entrada = new Scanner(System.in);


        System.out.print("Ingrese su numero de documento "); numDoc=Entrada.nextInt();

        this.setDocumento(numDoc);

        System.out.print("ingrese su nombre "); Nombre=Entrada.next();

        this.setNombre(Nombre);

        System.out.print("ingrese su apellido "); Apellido=Entrada.next();

        this.setApellido(Apellido);

        System.out.print("Peso: ");

        System.out.print("Ingrese peso "); peso=Entrada.nextInt();

        System.out.print("Ingrese Estatura "); estatura=Entrada.nextInt();

        this.setEstatura(estatura);

        System.out.print("Ingrese Edad "); edad=Entrada.nextInt();

        this.setEdad(edad);

        System.out.print("Ingrese Sexo "); sexo=Entrada.next();

        this.setSexo(sexo);
        
        System.out.print("Cargo: "); cargo = Entrada.next();

        String cargo2 = cargo;
        this.cargo = cargo2;

        System.out.print("Departamento: "); departamento = Entrada.next();

        String departamento2 = departamento;
        this.departamento = departamento2;

        System.out.print("Horas: "); horasTrabajadas = Entrada.nextInt();

        int horasTrabajadas2 = horasTrabajadas;
        this.horasTrabajadas = horasTrabajadas2;

        System.out.print("Precio de la Hora: "); valorHora = Entrada.nextDouble();

        double valorHora2 = valorHora;
        this.valorHora = valorHora2;

        Entrada.close();
    }

    public void mostrarDatosEmpleado() {

        System.out.print("Documento: " + this.getDocumento());

        System.out.print("Nombre: " + this.getNombre());

        System.out.print("Apellido: " + this.getApellido());

        System.out.print("Peso: " + this.getPeso());

        System.out.print("Estatura: " + this.getEstatura());

        System.out.print("Edad: " + this.getEdad());

        System.out.print("Sexo: " + this.getSexo());

        System.out.print("Cargo: " + this.cargo);

        System.out.print("Departamento: " + this.departamento);

        System.out.print("Horas Trabajadas: " + this.horasTrabajadas);

        System.out.print("Valor por Hora: " + this.valorHora);

        System.out.print("Total a Pagar: " + this.Honor());
    }

    
    public double Honor() {
        honor_1 = (this.valorHora * this.horasTrabajadas) * (1 - this.RETEICA);
        return honor_1;
    }

}
