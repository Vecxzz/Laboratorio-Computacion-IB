//Ejercicios 9,10

public class CuentaBancaria {
    // Atributos
    private double saldo;
    private int nrocuenta;

    // Constructor
    public CuentaBancaria(double saldo, int nrocuenta) {
        this.saldo = saldo;
        this.nrocuenta = nrocuenta;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public int getNrocuenta() {
        return nrocuenta;
    }

    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNrocuenta(int nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    // Método para depositar dinero
    public void depositarDinero(double deposito) {
        saldo += deposito;
    }

    // Método para retirar dinero
    public void retirarDinero(double retiro) {
        saldo -= retiro;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Saldo Actual: " + saldo);
        System.out.println("Número de Cuenta: " + nrocuenta);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase CuentaBancaria
        CuentaBancaria miCuentaBancaria = new CuentaBancaria(2500, 422);

        // Depositar y retirar dinero
        miCuentaBancaria.depositarDinero(1000);
        miCuentaBancaria.retirarDinero(500);

        // Mostrar información
        System.out.println("Información de la cuenta:");
        miCuentaBancaria.mostrarInformacion();
    }
}