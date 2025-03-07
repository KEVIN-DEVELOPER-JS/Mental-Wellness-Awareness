public class Coche {
    private final String  marca;
    private final String modelo;
    private int velocidad;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El coche " + marca + " " + modelo + " aceleró a " + velocidad + " km/h.");
    }

    // Método para frenar
    public void frenar() {
        velocidad = Math.max(0, velocidad - 10);
        System.out.println("El coche " + marca + " " + modelo + " frenó a " + velocidad + " km/h.");
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " " + modelo + ", Velocidad actual: " + velocidad + " km/h.");
    }
}