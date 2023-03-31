package Empleado.principal;
import Empleado.Salud.empleado;
import Empleado.Salud.persona;


public class Inicio {

    public static void main(String[] args) {

        persona objeto = new persona();

        empleado objeto_1 = new empleado();

        objeto_1.pedirDatosEmpleado();

        objeto_1.mostrarDatosEmpleado();

        objeto.pedirDatos();

        objeto.mostrarDatos();

    }
}
