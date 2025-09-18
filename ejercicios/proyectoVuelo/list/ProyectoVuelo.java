package list;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class ProyectoVuelo {
    private ArrayList<Vuelo> vuelos;
    private DateTimeFormatter formatter;

    public ProyectoVuelo() {
        vuelos = new ArrayList<>();
        formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm", new Locale("en", "US"));
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 5, 31), 67));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 4, 45), 47));
        vuelos.add(new Vuelo("SKU 021", "Rio de Janeiro", "Santiago", 
                LocalDateTime.of(2021, 8, 30, 16, 0), 52));
        vuelos.add(new Vuelo("AAL 147", "Atlanta", "Santiago", 
                LocalDateTime.of(2021, 8, 29, 13, 2), 39));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 14, 5), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 6, 50), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", 
                LocalDateTime.of(2021, 8, 30, 8, 45), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", 
                LocalDateTime.of(2021, 8, 29, 7, 41), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", 
                LocalDateTime.of(2021, 8, 30, 14, 35), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Angeles", "Santiago", 
                LocalDateTime.of(2021, 8, 29, 9, 14), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 8, 33), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 15, 15), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", 
                LocalDateTime.of(2021, 8, 30, 8, 14), 47));
        vuelos.add(new Vuelo("AAL 557", "Miami", "Santiago", 
                LocalDateTime.of(2021, 8, 29, 12, 53), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 9, 57), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancun", "Santiago", 
                LocalDateTime.of(2021, 8, 31, 4, 0), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", 
                LocalDateTime.of(2021, 8, 29, 7, 45), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", 
                LocalDateTime.of(2021, 8, 30, 7, 12), 58));
        vuelos.add(new Vuelo("LAT 501", "Paris", "Santiago", 
                LocalDateTime.of(2021, 8, 29, 18, 29), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", 
                LocalDateTime.of(2021, 8, 30, 15, 45), 39));
    }

    public void ordenarPorFechaLlegada() {
        Collections.sort(vuelos, new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return v1.getFechaLlegada().compareTo(v2.getFechaLlegada());
            }
        });
    }

    public Vuelo obtenerUltimoVuelo() {
        if (vuelos.isEmpty()) return null;
        return Collections.max(vuelos, new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return v1.getFechaLlegada().compareTo(v2.getFechaLlegada());
            }
        });
    }

    public Vuelo obtenerVueloMenorPasajeros() {
        if (vuelos.isEmpty()) return null;
        return Collections.min(vuelos, new Comparator<Vuelo>() {
            @Override
            public int compare(Vuelo v1, Vuelo v2) {
                return Integer.compare(v1.getNumPasajeros(), v2.getNumPasajeros());
            }
        });
    }

    public void mostrarResultados() {
        System.out.println("\nPROYECTO VUELO - RESULTADOS");
        System.out.println("=============================\n");

        ordenarPorFechaLlegada();
        
        System.out.println("1. Listado ordenado por fecha de llegada ascendente:");
        TablaConsola tabla = new TablaConsola();
        tabla.agregarEncabezado("Vuelo", "Origen", "Destino", "Fecha Llegada", "Pasajeros");
        
        for (Vuelo vuelo : vuelos) {
            tabla.agregarFila(
                vuelo.getNombre(),
                vuelo.getOrigen(),
                vuelo.getDestino(),
                vuelo.getFechaLlegada().format(formatter),
                String.valueOf(vuelo.getNumPasajeros())
            );
        }
        tabla.mostrar();

        Vuelo ultimoVuelo = obtenerUltimoVuelo();
        System.out.println("\n2. El ultimo vuelo en llegar es " + ultimoVuelo.getNombre() + 
                ": " + ultimoVuelo.getOrigen() + ", aterriza el " + 
                ultimoVuelo.getFechaLlegada().format(formatter));

        Vuelo vueloMenorPasajeros = obtenerVueloMenorPasajeros();
        System.out.println("\n3. El vuelo con menor numero de pasajeros es " + 
                vueloMenorPasajeros.getNombre() + ": " + vueloMenorPasajeros.getOrigen() + 
                ", con " + vueloMenorPasajeros.getNumPasajeros() + " pasajeros.");
    }

    public void guardarEnCSV(String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("Vuelo,Origen,Destino,Fecha Llegada,Num Pasajeros");
            for (Vuelo vuelo : vuelos) {
                writer.println(vuelo);
            }
            System.out.println("\nArchivo CSV guardado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ProyectoVuelo proyecto = new ProyectoVuelo();
        proyecto.mostrarResultados();
    }
}
