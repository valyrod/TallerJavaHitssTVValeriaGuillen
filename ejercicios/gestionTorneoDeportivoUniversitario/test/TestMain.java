package test;

import modelos.*;
import java.util.*;

public class TestMain {
    private GestorTorneo gestor;
    private Scanner scanner;
    
    public static void main(String[] args) {
        
        GestorTorneo gestor = new GestorTorneo();
        
        GenerarJugadores.registrarJugadoresDeEjemplo(gestor);
        
        TestMain menu = new TestMain(gestor);
        menu.mostrarMenu();
    }

    public TestMain() {
        this.gestor = new GestorTorneo();
        this.scanner = new Scanner(System.in);
    }
    
    public TestMain(GestorTorneo gestor) {
        this.gestor = gestor;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            mostrarMenuPrincipal();
            int opcion = leerEntero();
            
            switch (opcion) {
                case 1:
                    mostrarJugadoresPorDeporte();
                    break;
                case 2:
                    contarJugadoresEnCadaDisciplina();
                    break;
                case 3:
                    fusionarEquipos();
                    break;
                case 4:
                    verJugadoresEnComun();
                    break;
                case 5:
                    transferirJugador();
                    break;
                case 6:
                    mostrarJugadoresOrdenadosPorNombre();
                    break;
                case 7:
                    mostrarJugadoresEnOrdenDeInscripcion();
                    break;
                case 8:
                    mostrarRankingPorID();
                    break;
                case 9:
                    agregarNuevoJugador();
                    break;
                case 10:
                    inscribirJugadorEnDisciplina();
                    break;
                case 11:
                    eliminarJugadorDeDisciplina();
                    break;
                case 12:
                    buscarJugadorPorNombre();
                    break;
                // case 13:
                //     simularInscripciones();
                //     break;
                case 14:
                    return;
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
            }
        }
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\n" + "═".repeat(65));
        System.out.println("║" + centrarTexto("SISTEMA DE GESTION DE TORNEO DEPORTIVO", 63) + "║");
        System.out.println("║" + centrarTexto("UNIVERSITARIO", 63) + "║");
        System.out.println("═".repeat(65));
        System.out.println("║  1. Mostrar jugadores por deporte                             ║");
        System.out.println("║  2. Contar jugadores en cada disciplina                       ║");
        System.out.println("║  3. Fusionar equipos (union)                                  ║");
        System.out.println("║  4. Ver jugadores en comun (interseccion)                     ║");
        System.out.println("║  5. Transferir un jugador de un deporte a otro                ║");
        System.out.println("║  6. Mostrar todos los jugadores ordenados por nombre          ║");
        System.out.println("║  7. Mostrar todos los jugadores en orden de inscripcion       ║");
        System.out.println("║  8. Mostrar ranking de jugadores por ID                       ║");
        System.out.println("║  9. Agregar nuevo jugador                                     ║");
        System.out.println("║ 10. Inscribir jugador en disciplina                           ║");
        System.out.println("║ 11. Eliminar jugador de disciplina                            ║");
        System.out.println("║ 12. Buscar jugador por nombre                                 ║");
       //System.out.println("║ 13. Simular inscripciones aleatorias                          ║");
        System.out.println("║ 14. Salir                                                     ║");
        System.out.println("═".repeat(65));
        System.out.print("Selecciona una opción: ");
    }

    private void mostrarJugadoresPorDeporte() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("║" + centrarTexto("JUGADORES POR DEPORTE", 58) + "║");
        System.out.println("═".repeat(60));
        System.out.print("Ingrese el deporte (futbol, basquetbol, voleibol, natacion): ");
        String deporte = scanner.nextLine().trim().toLowerCase();
        
        List<Jugador> jugadores = gestor.obtenerJugadoresPorDisciplina(deporte);
        
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores inscritos en " + deporte + ".");
        } else {
            mostrarTablaJugadores(jugadores, "JUGADORES EN " + deporte.toUpperCase());
        }
    }

    private void contarJugadoresEnCadaDisciplina() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("║" + centrarTexto("CONTADOR POR DISCIPLINA", 48) + "║");
        System.out.println("═".repeat(50));
        
        Map<String, Long> contador = gestor.contarJugadoresPorDisciplina();
        
        System.out.println("┌" + "─".repeat(20) + "┬" + "─".repeat(15) + "┐");
        System.out.println("│" + centrarTexto("DISCIPLINA", 20) + "│" + centrarTexto("JUGADORES", 15) + "│");
        System.out.println("├" + "─".repeat(20) + "┼" + "─".repeat(15) + "┤");
        
        for (Map.Entry<String, Long> entry : contador.entrySet()) {
            String disciplina = entry.getKey().toUpperCase();
            String cantidad = entry.getValue().toString();
            System.out.println("│" + ajustarTexto(disciplina, 20) + "│" + centrarTexto(cantidad, 15) + "│");
        }
        
        System.out.println("└" + "─".repeat(20) + "┴" + "─".repeat(15) + "┘");
    }

    private void fusionarEquipos() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("║" + centrarTexto("FUSION DE EQUIPOS", 48) + "║");
        System.out.println("═".repeat(50));
        
        System.out.print("Ingrese la primera disciplina: ");
        String disciplina1 = scanner.nextLine().trim().toLowerCase();
        System.out.print("Ingrese la segunda disciplina: ");
        String disciplina2 = scanner.nextLine().trim().toLowerCase();
        
        System.out.println("\nSupón que " + disciplina1 + " y " + disciplina2 + " harán un entrenamiento conjunto.");
        
        List<Jugador> equipo1 = gestor.obtenerJugadoresPorDisciplina(disciplina1);
        List<Jugador> equipo2 = gestor.obtenerJugadoresPorDisciplina(disciplina2);
        
        mostrarTablaJugadores(equipo1, "EQUIPO DE " + disciplina1.toUpperCase());
        mostrarTablaJugadores(equipo2, "EQUIPO DE " + disciplina2.toUpperCase());
        
        Set<Jugador> jugadoresUnicos = gestor.fusionarJugadoresDeEquipos(disciplina1, disciplina2);
        
        System.out.println("\n" + "═".repeat(60));
        System.out.println("║" + centrarTexto("JUGADORES ÚNICOS PARA ENTRENAMIENTO", 58) + "║");
        System.out.println("═".repeat(60));
        
        mostrarListaNombres(jugadoresUnicos);
        System.out.println("\nTotal: " + jugadoresUnicos.size() + " jugadores únicos.");
    }

    private void verJugadoresEnComun() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("║" + centrarTexto("JUGADORES EN COMÚN", 48) + "║");
        System.out.println("═".repeat(50));
        
        System.out.print("Ingrese la primera disciplina: ");
        String disciplina1 = scanner.nextLine().trim().toLowerCase();
        System.out.print("Ingrese la segunda disciplina: ");
        String disciplina2 = scanner.nextLine().trim().toLowerCase();
        
        List<Jugador> comunes = gestor.buscarJugadoresComunes(disciplina1, disciplina2);
        
        if (comunes.isEmpty()) {
            System.out.println("No hay jugadores que estén inscritos tanto en " + 
                             disciplina1 + " como en " + disciplina2 + ".");
        } else {
            mostrarTablaJugadores(comunes, "JUGADORES EN " + disciplina1.toUpperCase() + 
                                 " Y " + disciplina2.toUpperCase());
        }
    }

    private void transferirJugador() {
        System.out.println("\n" + "═".repeat(40));
        System.out.println("║" + centrarTexto("TRANSFERIR JUGADOR", 38) + "║");
        System.out.println("═".repeat(40));
        
        System.out.print("Ingrese el ID del jugador: ");
        String id = scanner.nextLine().trim();
        System.out.print("Disciplina de origen: ");
        String origen = scanner.nextLine().trim().toLowerCase();
        System.out.print("Disciplina de destino: ");
        String destino = scanner.nextLine().trim().toLowerCase();
        
        if (gestor.transferirJugador(id, origen, destino)) {
            System.out.println("Jugador transferido exitosamente de " + origen + " a " + destino + ".");
        } else {
            System.out.println("No se pudo transferir el jugador. Verifique que el jugador exista " +
                             "y esté inscrito en la disciplina de origen.");
        }
    }

    private void mostrarJugadoresOrdenadosPorNombre() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("║" + centrarTexto("JUGADORES ORDENADOS ALFABÉTICAMENTE", 58) + "║");
        System.out.println("═".repeat(60));
        
        List<Jugador> jugadores = gestor.obtenerJugadoresOrdenadosAlfabeticamente();
        
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            mostrarTablaJugadores(jugadores, "ORDEN ALFABÉTICO");
        }
    }

    private void mostrarJugadoresEnOrdenDeInscripcion() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("║" + centrarTexto("JUGADORES EN ORDEN DE INSCRIPCIÓN", 58) + "║");
        System.out.println("═".repeat(60));
        
        List<Jugador> jugadores = gestor.obtenerTodosLosJugadores();
        
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            mostrarTablaJugadores(jugadores, "ORDEN DE INSCRIPCIÓN");
        }
    }

    private void mostrarRankingPorID() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("║" + centrarTexto("RANKING DE JUGADORES POR ID", 58) + "║");
        System.out.println("═".repeat(60));
        
        List<Jugador> jugadores = gestor.obtenerJugadoresOrdenadosPorId();
        
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            mostrarTablaRanking(jugadores);
        }
    }

    private void agregarNuevoJugador() {
        System.out.println("\n" + "═".repeat(40));
        System.out.println("║" + centrarTexto("AGREGAR NUEVO JUGADOR", 38) + "║");
        System.out.println("═".repeat(40));
        
        System.out.print("Ingrese el ID del jugador: ");
        String id = scanner.nextLine().trim();
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine().trim();
        
        if (gestor.registrarJugador(id, nombre)) {
            System.out.println("Jugador registrado exitosamente.");
        } else {
            System.out.println("No se pudo registrar el jugador. El ID o nombre ya existe.");
        }
    }

    private void inscribirJugadorEnDisciplina() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("║" + centrarTexto("INSCRIBIR JUGADOR EN DISCIPLINA", 48) + "║");
        System.out.println("═".repeat(50));
        
        System.out.print("Ingrese el ID del jugador: ");
        String id = scanner.nextLine().trim();
        
        System.out.println("\nDisciplinas disponibles:");
        mostrarDisciplinasDisponibles();
        
        System.out.print("Ingrese la disciplina: ");
        String disciplina = scanner.nextLine().trim().toLowerCase();
        
        if (gestor.inscribirJugadorEnDisciplina(id, disciplina)) {
            System.out.println("Jugador inscrito exitosamente en " + disciplina + ".");
        } else {
            System.out.println("No se pudo inscribir el jugador. Verifique que el jugador exista " +
                             "y no esté ya inscrito en esta disciplina.");
        }
    }

    private void eliminarJugadorDeDisciplina() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("║" + centrarTexto("ELIMINAR JUGADOR DE DISCIPLINA", 48) + "║");
        System.out.println("═".repeat(50));
        
        System.out.print("Ingrese el ID del jugador: ");
        String id = scanner.nextLine().trim();
        System.out.print("Ingrese la disciplina: ");
        String disciplina = scanner.nextLine().trim().toLowerCase();
        
        if (gestor.eliminarJugadorDeDisciplina(id, disciplina)) {
            System.out.println("Jugador eliminado exitosamente de " + disciplina + ".");
        } else {
            System.out.println("No se pudo eliminar el jugador. Verifique que el jugador exista " +
                             "y esté inscrito en esta disciplina.");
        }
    }

    private void buscarJugadorPorNombre() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("║" + centrarTexto("BUSCAR JUGADOR POR NOMBRE", 48) + "║");
        System.out.println("═".repeat(50));
        
        System.out.print("Ingrese el nombre (o parte del nombre): ");
        String nombre = scanner.nextLine().trim();
        
        List<Jugador> encontrados = gestor.buscarJugadorPorNombreCompleto(nombre);
        
        if (encontrados.isEmpty()) {
            System.out.println("No se encontraron jugadores con ese nombre.");
        } else {
            mostrarTablaJugadores(encontrados, "JUGADORES ENCONTRADOS");
        }
    }

    // private void simularInscripciones() {
    //     System.out.println("\n" + "═".repeat(50));
    //     System.out.println("║" + centrarTexto("SIMULACIÓN DE INSCRIPCIONES", 48) + "║");
    //     System.out.println("═".repeat(50));
        
    //     List<Jugador> jugadores = gestor.simularInscripcionesAleatorias();
        
    //     System.out.println("Se han generado inscripciones aleatorias para todos los jugadores:");
    //     mostrarTablaJugadores(jugadores, "INSCRIPCIONES ALEATORIAS");
    // }

    private void mostrarTablaJugadores(List<Jugador> jugadores, String titulo) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores para mostrar.");
            return;
        }

        System.out.println("\n┌" + "─".repeat(titulo.length() + 2) + "┐");
        System.out.println("│ " + titulo + " │");
        System.out.println("├" + "─".repeat(titulo.length() + 2) + "┤");
        System.out.println("└" + "─".repeat(titulo.length() + 2) + "┘");
        
        System.out.println("┌" + "─".repeat(10) + "┬" + "─".repeat(25) + "┬" + "─".repeat(30) + "┐");
        System.out.println("│" + centrarTexto("ID", 10) + "│" + centrarTexto("NOMBRE", 25) + "│" + centrarTexto("DISCIPLINAS", 30) + "│");
        System.out.println("├" + "─".repeat(10) + "┼" + "─".repeat(25) + "┼" + "─".repeat(30) + "┤");
        
        for (Jugador jugador : jugadores) {
            String id = jugador.getId();
            String nombre = jugador.getNombre();
            String disciplinas = String.join(", ", jugador.getDisciplinas());
            
            if (disciplinas.length() > 28) {
                disciplinas = disciplinas.substring(0, 25) + "...";
            }
            
            System.out.println("│" + centrarTexto(id, 10) + "│" + ajustarTexto(nombre, 25) + "│" + ajustarTexto(disciplinas, 30) + "│");
        }
        
        System.out.println("└" + "─".repeat(10) + "┴" + "─".repeat(25) + "┴" + "─".repeat(30) + "┘");
        System.out.println("Total: " + jugadores.size() + " jugadores");
    }

    private void mostrarTablaRanking(List<Jugador> jugadores) {
        System.out.println("┌" + "─".repeat(8) + "┬" + "─".repeat(10) + "┬" + "─".repeat(25) + "┬" + "─".repeat(30) + "┐");
        System.out.println("│" + centrarTexto("RANK", 8) + "│" + centrarTexto("ID", 10) + "│" + centrarTexto("NOMBRE", 25) + "│" + centrarTexto("DISCIPLINAS", 30) + "│");
        System.out.println("├" + "─".repeat(8) + "┼" + "─".repeat(10) + "┼" + "─".repeat(25) + "┼" + "─".repeat(30) + "┤");
        
        int ranking = 1;
        for (Jugador jugador : jugadores) {
            String rankStr = "#" + ranking;
            String id = jugador.getId();
            String nombre = jugador.getNombre();
            String disciplinas = String.join(", ", jugador.getDisciplinas());
            
            if (disciplinas.length() > 28) {
                disciplinas = disciplinas.substring(0, 25) + "...";
            }
            
            System.out.println("│" + centrarTexto(rankStr, 8) + "│" + centrarTexto(id, 10) + "│" + ajustarTexto(nombre, 25) + "│" + ajustarTexto(disciplinas, 30) + "│");
            ranking++;
        }
        
        System.out.println("└" + "─".repeat(8) + "┴" + "─".repeat(10) + "┴" + "─".repeat(25) + "┴" + "─".repeat(30) + "┘");
    }

    private void mostrarListaNombres(Set<Jugador> jugadores) {
        System.out.println("┌" + "─".repeat(30) + "┐");
        System.out.println("│" + centrarTexto("JUGADORES", 30) + "│");
        System.out.println("├" + "─".repeat(30) + "┤");
        
        for (Jugador jugador : jugadores) {
            System.out.println("│ " + ajustarTexto(jugador.getNombre(), 28) + " │");
        }
        
        System.out.println("└" + "─".repeat(30) + "┘");
    }

    private void mostrarDisciplinasDisponibles() {
        Set<String> disciplinas = gestor.obtenerDisciplinasDisponibles();
        
        System.out.println("┌" + "─".repeat(20) + "┐");
        System.out.println("│" + centrarTexto("DISCIPLINAS", 20) + "│");
        System.out.println("├" + "─".repeat(20) + "┤");
        
        for (String disciplina : disciplinas) {
            System.out.println("│ " + ajustarTexto(disciplina, 18) + " │");
        }
        
        System.out.println("└" + "─".repeat(20) + "┘");
    }

    private String centrarTexto(String texto, int ancho) {
        if (texto.length() >= ancho) {
            return texto.substring(0, ancho);
        }
        
        int espaciosTotal = ancho - texto.length();
        int espaciosIzq = espaciosTotal / 2;
        int espaciosDer = espaciosTotal - espaciosIzq;
        
        return " ".repeat(espaciosIzq) + texto + " ".repeat(espaciosDer);
    }

    private String ajustarTexto(String texto, int ancho) {
        if (texto.length() >= ancho) {
            return texto.substring(0, ancho - 1) + "…";
        }
        return " " + texto + " ".repeat(ancho - texto.length() - 1);
    }

    private int leerEntero() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Por favor, ingrese un numero valido: ");
            }
        }
    }
}