package clasesconcretas;

import clasesabstractas.Electronico;

public class Phone extends Electronico {
    private String modelo;
    private String color;

    public Phone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.20;
    }

  
}





