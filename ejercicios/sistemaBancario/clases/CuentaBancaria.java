package clases;

public class CuentaBancaria {
    private int id;
    private String titular;
    private double saldo;
    private Transaccion[] transacciones;
    private int numeroTransacciones;

    private static int contador = 0;

    public CuentaBancaria() {
        this.id = ++contador;
        this.transacciones = new Transaccion[100];
        this.numeroTransacciones = 0;
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this();
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        registrarTransaccion(new Transaccion("Depósito", monto, this));
        System.out.println("Depósito de $" + monto + " en la cuenta de " + titular);
    }

    public boolean retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            registrarTransaccion(new Transaccion("Retiro", monto, this));
            System.out.println("Retiro de $" + monto + " en la cuenta de " + titular);
            return true;
        } else {
            System.out.println("Fondos insuficientes en la cuenta de " + titular);
            return false;
        }
    }

    private void registrarTransaccion(Transaccion t) {
        if (numeroTransacciones < transacciones.length) {
            transacciones[numeroTransacciones++] = t;
        } else {
            System.out.println("No se pueden registrar más transacciones en la cuenta de " + titular);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Cuenta ID: " + id + ", Titular: " + titular + ", Saldo actual: $" + saldo);
        System.out.println("\nHistorial de transacciones:");
        if (numeroTransacciones == 0) {
            System.out.println("\nNo hay transacciones registradas.");
        } else {
            System.out.printf("%-10s %-15s %-10s\n", "ID", "Tipo", "Monto");
            System.out.println("------------------------------------");
            for (int i = 0; i < numeroTransacciones; i++) {
                Transaccion t = transacciones[i];
                System.out.printf("%-10s %-15s %-10.2f\n", t.getId(), t.getTipo(), t.getMonto());
            }
            System.out.println("------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria: id=" + id + ", titular=" + titular + ", saldo=" + saldo;
    }

    public static void resetContador() {
        contador = 0;
    }
}