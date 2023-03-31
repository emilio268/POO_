package Figuras_geometricas.Figuras_Clases;

public class Triangulo extends Figura_Abstract {


    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double op() {
        return (base * altura) / 2;
    }
}
