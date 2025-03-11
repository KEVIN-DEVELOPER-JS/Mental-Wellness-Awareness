public class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return getBase() * getAltura(); // Usando getters
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (getBase() + getAltura()); // Usando getters
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

// Ejemplo de uso
class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        // Usando setters para modificar los valores
        rectangulo.setBase(8);
        rectangulo.setAltura(12);
        System.out.println("Nuevo área del rectángulo: " + rectangulo.calcularArea());
    }
}