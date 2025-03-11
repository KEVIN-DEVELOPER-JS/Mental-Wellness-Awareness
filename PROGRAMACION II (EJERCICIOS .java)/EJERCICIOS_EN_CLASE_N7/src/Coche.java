public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int puertas;
    private String matricula;

    // Constructor
    public Coche(String color, String marca, String modelo, int caballos, int puertas, String matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.puertas = puertas;
        this.matricula = matricula;
    }

    // Método para mostrar la información del coche
    public String mostrarInfo() {
        return "Coche: " + getMarca() + " " + getModelo() + ", Color: " + getColor() +
                ", Caballos: " + getCaballos() + ", Puertas: " + getPuertas() +
                ", Matrícula: " + getMatricula(); // Usando getters
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

// Ejemplo de uso
class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Rojo", "Toyota", "Corolla", 120, 4, "ABC123");
        System.out.println(coche1.mostrarInfo());
        coche1.setMarca("Toyota");
        coche1.setModelo("Corolla XE-1");
        coche1.setPuertas(4);
        coche1.setMatricula("254IDS");
        coche1.setColor("Azul");
        coche1.setCaballos(600);
        System.out.println("Información actualizada: " + coche1.mostrarInfo());

        Coche coche2 = new Coche("Verde","Chevrolet","Corvette",150,4,"DES231");
        System.out.println(coche2.mostrarInfo());
        // Usando setters para modificar los valores
        coche2.setMarca("Chevrolet");
        coche2.setModelo("Corvette ZR1");
        coche2.setPuertas(2);
        coche2.setMatricula("2133D1");
        coche2.setColor("Azul");
        coche2.setCaballos(1064);
        System.out.println("Información actualizada: " + coche2.mostrarInfo());
    }
}