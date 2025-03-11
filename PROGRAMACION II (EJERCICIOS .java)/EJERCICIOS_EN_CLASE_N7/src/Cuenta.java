public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return getSaldo(); // Usando getters
    }

    // Método para recibir un abono
    public void recibirAbono(double cantidad) {
        setSaldo(getSaldo() + cantidad); // Usando getters y setters
    }

    // Método para pagar un recibo
    public String pagarRecibo(double cantidad) {
        if (cantidad > getSaldo()) { // Usando getters
            return "Saldo insuficiente";
        }
        setSaldo(getSaldo() - cantidad); // Usando getters y setters
        return "Recibo pagado. Saldo restante: " + getSaldo();
    }

    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

// Ejemplo de uso
class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("123456789", 1000);
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());
        System.out.println("Número de cuenta inicial: " + cuenta.getNumeroCuenta());

        cuenta.setNumeroCuenta("987654321");
        System.out.println("Número de cuenta actualizado: " + cuenta.getNumeroCuenta());

        cuenta.recibirAbono(500);
        System.out.println("Saldo después del abono: " + cuenta.consultarSaldo());

        System.out.println(cuenta.pagarRecibo(200));
        System.out.println("Saldo después de pagar el recibo: " + cuenta.consultarSaldo());
    }
}
