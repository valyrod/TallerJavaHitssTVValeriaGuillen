package clases;

public class Transaccion {
    private int id;
    private String tipo;
    private double monto;
    private int idCuenta;

    private static int contador = 0;

    public Transaccion() {
        this.id = ++contador; // ID autoincrementable
    }

    public Transaccion(String tipo, double monto, CuentaBancaria cuenta) {
        this();
        this.tipo = tipo;
        this.monto = monto;
        this.idCuenta = cuenta.getId();
    }

    // ==== GET y SET ====
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public String toString() {
        return "Transacción: id=" + id + ", tipo=" + tipo + ", monto=" + monto + ", idCuenta=" + idCuenta;
    }

    // ==== RESET ====
    public static void resetContador() {
        contador = 0;
    }
}
