// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Rectangulo y Circulo
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Circulo circulo = new Circulo(7);

        // Establecer colores
        rectangulo.setColor("Rojo");
        circulo.setColor("Azul");

        // Demostrar polimorfismo
        FormaGeometrica[] formas = new FormaGeometrica[2];
        formas[0] = rectangulo;
        formas[1] = circulo;

        for (FormaGeometrica forma : formas) {
            System.out.println("El color de la forma es: " + forma.getColor());
            System.out.println("El área de la forma es: " + forma.calcularArea());
        }
    }
}
