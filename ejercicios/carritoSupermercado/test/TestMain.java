package test;
import clases.*;

public class TestMain {
    public static void main(String[] args) {
        BolsaGenerica<Lacteo> lacteosBag = new BolsaGenerica<>("Lácteos");
        lacteosBag.agregarProducto(new Lacteo("Leche entera", 2.8, 1000, 8));
        lacteosBag.agregarProducto(new Lacteo("Yogur natural", 1.2, 150, 5));
        lacteosBag.agregarProducto(new Lacteo("Queso cheddar", 4.5, 200, 25));
        lacteosBag.agregarProducto(new Lacteo("Mantequilla", 3.0, 250, 7));
        lacteosBag.agregarProducto(new Lacteo("Leche de almendras", 3.2, 750, 2));

        BolsaGenerica<Fruta> frutasBag = new BolsaGenerica<>("Frutas");
        frutasBag.agregarProducto(new Fruta("Manzana", 1.5, 0.3, "Rojo"));
        frutasBag.agregarProducto(new Fruta("Banana", 0.8, 0.25, "Amarillo"));
        frutasBag.agregarProducto(new Fruta("Naranja", 1.2, 0.4, "Naranja"));
        frutasBag.agregarProducto(new Fruta("Uva", 2.0, 0.15, "Morado"));
        frutasBag.agregarProducto(new Fruta("Pera", 1.8, 0.35, "Verde"));

        BolsaGenerica<Limpieza> limpiezaBag = new BolsaGenerica<>("Limpieza");
        limpiezaBag.agregarProducto(new Limpieza("Detergente", 3.5, "Soda cáustica", 2.5));
        limpiezaBag.agregarProducto(new Limpieza("Jabón líquido", 4.0, "Aceites vegetales", 1.8));
        limpiezaBag.agregarProducto(new Limpieza("Limpiador multisuperficie", 6.0, "Alcohol isopropílico", 0.7));
        limpiezaBag.agregarProducto(new Limpieza("Desinfectante", 5.5, "Cloro", 1.2));
        limpiezaBag.agregarProducto(new Limpieza("Suavizante", 3.8, "Perfumado sintético", 1.5));

        BolsaGenerica<NoPerecible> noPereciblesBag = new BolsaGenerica<>("No Perecibles");
        noPereciblesBag.agregarProducto(new NoPerecible("Arroz", 1.0, 350));
        noPereciblesBag.agregarProducto(new NoPerecible("Lentejas", 1.5, 320));
        noPereciblesBag.agregarProducto(new NoPerecible("Harina", 0.8, 340));
        noPereciblesBag.agregarProducto(new NoPerecible("Azúcar", 1.2, 400));
        noPereciblesBag.agregarProducto(new NoPerecible("Sal", 0.5, 0));

        lacteosBag.mostrarDetalles();
        frutasBag.mostrarDetalles();
        limpiezaBag.mostrarDetalles();
        noPereciblesBag.mostrarDetalles();
        
        mostrarResumenTotal(lacteosBag, frutasBag, limpiezaBag, noPereciblesBag);
    }

    private static void mostrarResumenTotal(BolsaGenerica<Lacteo> lacteos, BolsaGenerica<Fruta> frutas, 
                                           BolsaGenerica<Limpieza> limpieza, BolsaGenerica<NoPerecible> noPerecibles) {
        System.out.println("=== RESUMEN GENERAL DEL CARRITO ===");
        
        double totalLacteos = lacteos.getTotal();
        double totalFrutas = frutas.getTotal();
        double totalLimpieza = limpieza.getTotal();
        double totalNoPerecibles = noPerecibles.getTotal();
        
        int totalProductos = lacteos.getCantidadProductos() + frutas.getCantidadProductos() + 
                           limpieza.getCantidadProductos() + noPerecibles.getCantidadProductos();
        double totalGeneral = totalLacteos + totalFrutas + totalLimpieza + totalNoPerecibles;
        
        System.out.println("Lácteos: " + lacteos.getCantidadProductos() + " productos - $" + String.format("%.2f", totalLacteos));
        System.out.println("Frutas: " + frutas.getCantidadProductos() + " productos - $" + String.format("%.2f", totalFrutas));
        System.out.println("Limpieza: " + limpieza.getCantidadProductos() + " productos - $" + String.format("%.2f", totalLimpieza));
        System.out.println("No Perecibles: " + noPerecibles.getCantidadProductos() + " productos - $" + String.format("%.2f", totalNoPerecibles));
        System.out.println("---------------------------------------");
        System.out.println("Total de productos: " + totalProductos);
        System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", totalGeneral));
        System.out.println("=======================================");
    }
}