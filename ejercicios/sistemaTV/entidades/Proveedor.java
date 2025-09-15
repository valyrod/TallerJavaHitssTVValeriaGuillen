package entidades;

public class Proveedor {
    private String rfc;
    private String nombre;
    private String razonSocial;

    public Proveedor(String rfc, String nombre, String razonSocial) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
    }
    public String getRfc() {
        return rfc;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    @Override
    public String toString() {
        return "Proveedor [rfc: " + rfc + ", nombre: " + nombre + ", razonSocial: " + razonSocial + "]";
    }
}









