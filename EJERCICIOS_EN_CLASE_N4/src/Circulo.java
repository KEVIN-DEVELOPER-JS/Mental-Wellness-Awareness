// Circulo.java
public class Circulo extends FormaGeometrica {
    private final double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribir el método calcularArea()
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
