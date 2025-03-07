public class Main {
    public static void main(String[] args) {
        // Probando la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla");
        miCoche.mostrarInfo();
        miCoche.acelerar(50);
        miCoche.frenar();

        // Probando la clase Estudiante
        Estudiante estudiante = new Estudiante("Juan Pérez", 20, "Ingeniería de Software");
        estudiante.mostrarInfo();
        estudiante.estudiar("Programación Orientada a Objetos");

        // Probando la clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456789");
        cuenta.mostrarInfo();
        cuenta.depositar(1000);
        cuenta.retirar(500);
        cuenta.retirar(600); // Intentar retirar más de lo disponible
    }
}