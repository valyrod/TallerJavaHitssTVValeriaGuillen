package test;

import excepciones.NombreInvalidoException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManejadorUsuarios {

    public static void main(String[] args) {
        String nombreArchivo = "usuarios.txt";
        Path rutaArchivo = Paths.get(nombreArchivo);

        try {
            List<String> usuarios = Files.readAllLines(rutaArchivo);
            System.out.println("Usuarios leídos del archivo:");
            for (String usuario : usuarios) {
                validarNombreUsuario(usuario);
                System.out.println("- " + usuario);
            }
        } catch (IOException e) {
            System.err.println("Error: El archivo '" + nombreArchivo + "' no se encontró. " + e.getMessage());
        } catch (NombreInvalidoException e) {
            System.err.println("Error de validación: " + e.getMessage());
        }
    }

    private static void validarNombreUsuario(String nombre) throws NombreInvalidoException {
        if (nombre == null || nombre.trim().length() < 3) {
            throw new NombreInvalidoException("El nombre de usuario '" + nombre + "' es inválido. Debe tener al menos 3 caracteres.");
        }
    }
}
