package clase;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import entidades.Factura;

public class claseMetEst {

    private static final String FOLDER_PATH = "facturas";

    public static void guardarFactura(Factura factura) {
        new File(FOLDER_PATH).mkdirs();
        String fileName = FOLDER_PATH + "/factura_" + factura.getId() + ".txt";
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.print(factura.generarFactura());
            System.out.println("Factura " + factura.getId() + " guardada en " + fileName);
        } catch (IOException e) {
            System.err.println("Error al guardar la factura: " + e.getMessage());
        }
    }

    public static void leerFactura(Long idFactura) {
        String fileName = FOLDER_PATH + "/factura_" + idFactura + ".txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("\n--- Contenido de la Factura " + idFactura + " ---");
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Error al leer la factura: " + e.getMessage());
        }
    }

    public static void listarFacturas() {
        File folder = new File(FOLDER_PATH);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("No se encontraron facturas.");
            return;
        }
        System.out.println("\n--- Facturas existentes ---");
        try (Stream<String> stream = Files.list(Paths.get(FOLDER_PATH))
                                        .filter(Files::isRegularFile)
                                        .map(p -> p.getFileName().toString())) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error al listar las facturas: " + e.getMessage());
        }
    }
}
