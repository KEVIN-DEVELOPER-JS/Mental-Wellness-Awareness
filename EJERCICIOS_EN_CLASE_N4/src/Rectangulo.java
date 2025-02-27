// Rectangulo.java
public class Rectangulo extends FormaGeometrica {
    // Propiedades específicas para el rectángulo
    private final double base;
    private final double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Sobrescribir el método calcularArea()
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
