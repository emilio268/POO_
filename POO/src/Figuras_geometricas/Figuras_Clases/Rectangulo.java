package Figuras_geometricas.Figuras_Clases;

public class Rectangulo extends Figura_Abstract {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {

        this.base = base;

        this.altura = altura;
    }

    public double op() {
        return (base * altura);
    }
}
