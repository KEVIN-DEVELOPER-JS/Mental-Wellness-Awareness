public class Estudiante {
    private final String nombre;
    private final int edad;
    private final String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Método para estudiar
    public void estudiar(String materia) {
        System.out.println(nombre + " está estudiando " + materia + ".");
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);
    }
}