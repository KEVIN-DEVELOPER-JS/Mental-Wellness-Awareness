public class CuentaBancaria {
    private final String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron $" + monto + " en la cuenta " + numeroCuenta + ". Saldo actual: $" + saldo);
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + " de la cuenta " + numeroCuenta + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes en la cuenta " + numeroCuenta + ".");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo actual: $" + saldo);
    }
}