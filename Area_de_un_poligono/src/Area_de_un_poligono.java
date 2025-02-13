public class Area_de_un_poligono {

    // Función única para calcular y retornar el área de un polígono
    public static double calcularArea(Poligono poligono) {
        return poligono.calcularArea();
    }

    public static void main(String[] args) {
        // Crear instancias de cada tipo de polígono
        Poligono triangulo = new Triangulo(5, 10);
        Poligono cuadrado = new Cuadrado(7);
        Poligono rectangulo = new Rectangulo(6, 8);

        // Calcular y mostrar el área de cada polígono
        System.out.println("El área del Triángulo es: " + calcularArea(triangulo));
        System.out.println("El área del Cuadrado es: " + calcularArea(cuadrado));
        System.out.println("El área del Rectángulo es: " + calcularArea(rectangulo));
    }
}

// Clase base para polígonos
abstract class Poligono {
    public abstract double calcularArea();
}

// Clase para Triángulo
class Triangulo extends Poligono {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Clase para Cuadrado
class Cuadrado extends Poligono {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Clase para Rectángulo
class Rectangulo extends Poligono {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}