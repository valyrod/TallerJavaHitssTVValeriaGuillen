package clasesabstractas;

import interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

  @Override
    public String getFabricante() {
        return fabricante;
    }
 
}
