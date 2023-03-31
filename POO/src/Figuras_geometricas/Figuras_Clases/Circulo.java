package Figuras_geometricas.Figuras_Clases;

public class Circulo extends Figura_Abstract {

    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }


    public double op() {
        return (radio * radio)*3.1416;
    }
}

