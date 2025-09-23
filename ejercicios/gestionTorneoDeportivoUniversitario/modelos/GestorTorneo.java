package modelos;

import modelos.Jugador;
import java.util.*;
import java.util.stream.Collectors;

public class GestorTorneo {
    private List<Jugador> jugadores;
    private Set<String> disciplinasDisponibles;

    public GestorTorneo() {
        this.jugadores = new ArrayList<>();
        this.disciplinasDisponibles = new HashSet<>();
        inicializarDisciplinas();
    }

    private void inicializarDisciplinas() {
        disciplinasDisponibles.add("futbol");
        disciplinasDisponibles.add("basquetbol");
        disciplinasDisponibles.add("voleibol");
        disciplinasDisponibles.add("natacion");
    }

    public boolean registrarJugador(String id, String nombre) {
        if (existeJugadorPorId(id) || existeJugadorPorNombre(nombre)) {
            return false;
        }
        jugadores.add(new Jugador(id, nombre));
        return true;
    }

    public boolean inscribirJugadorEnDisciplina(String id, String disciplina) {
        Jugador jugador = buscarJugadorPorId(id);
        if (jugador != null && disciplinasDisponibles.contains(disciplina.toLowerCase())) {
            if (!jugador.estaInscritoEn(disciplina.toLowerCase())) {
                jugador.agregarDisciplina(disciplina.toLowerCase());
                return true;
            }
        }
        return false;
    }

    public List<Jugador> obtenerJugadoresPorDisciplina(String disciplina) {
        LinkedHashSet<Jugador> jugadoresOrdenados = new LinkedHashSet<>();
        for (Jugador jugador : jugadores) {
            if (jugador.estaInscritoEn(disciplina.toLowerCase())) {
                jugadoresOrdenados.add(jugador);
            }
        }
        return new ArrayList<>(jugadoresOrdenados);
    }

    public List<Jugador> obtenerJugadoresOrdenadosAlfabeticamente() {
        TreeSet<Jugador> jugadoresOrdenados = new TreeSet<>(
            Comparator.comparing(Jugador::getNombre, String.CASE_INSENSITIVE_ORDER)
        );
        jugadoresOrdenados.addAll(jugadores);
        return new ArrayList<>(jugadoresOrdenados);
    }

    public List<Jugador> obtenerJugadoresOrdenadosPorId() {
        return jugadores.stream()
                .sorted(Comparator.comparing(Jugador::getId))
                .collect(Collectors.toList());
    }

    public Map<String, Long> contarJugadoresPorDisciplina() {
        Map<String, Long> contador = new HashMap<>();
        for (String disciplina : disciplinasDisponibles) {
            long count = jugadores.stream()
                    .filter(j -> j.estaInscritoEn(disciplina))
                    .count();
            contador.put(disciplina, count);
        }
        return contador;
    }

    public List<Jugador> buscarJugadoresComunes(String disciplina1, String disciplina2) {
        LinkedHashSet<Jugador> jugadoresComunes = new LinkedHashSet<>();
        for (Jugador jugador : jugadores) {
            if (jugador.estaInscritoEn(disciplina1.toLowerCase()) && 
                jugador.estaInscritoEn(disciplina2.toLowerCase())) {
                jugadoresComunes.add(jugador);
            }
        }
        return new ArrayList<>(jugadoresComunes);
    }

    public boolean transferirJugador(String id, String disciplinaOrigen, String disciplinaDestino) {
        Jugador jugador = buscarJugadorPorId(id);
        if (jugador != null && jugador.estaInscritoEn(disciplinaOrigen.toLowerCase()) &&
            disciplinasDisponibles.contains(disciplinaDestino.toLowerCase())) {
            jugador.eliminarDisciplina(disciplinaOrigen.toLowerCase());
            jugador.agregarDisciplina(disciplinaDestino.toLowerCase());
            return true;
        }
        return false;
    }

    public boolean eliminarJugadorDeDisciplina(String id, String disciplina) {
        Jugador jugador = buscarJugadorPorId(id);
        if (jugador != null && jugador.estaInscritoEn(disciplina.toLowerCase())) {
            jugador.eliminarDisciplina(disciplina.toLowerCase());
            return true;
        }
        return false;
    }

    public List<Jugador> buscarJugadorPorNombreCompleto(String nombre) {
        return jugadores.stream()
                .filter(j -> j.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Jugador buscarJugadorPorId(String id) {
        return jugadores.stream()
                .filter(j -> j.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean existeJugadorPorId(String id) {
        return jugadores.stream().anyMatch(j -> j.getId().equals(id));
    }

    public boolean existeJugadorPorNombre(String nombre) {
        return jugadores.stream().anyMatch(j -> j.getNombre().equalsIgnoreCase(nombre));
    }

    public List<Jugador> obtenerTodosLosJugadores() {
        return new ArrayList<>(jugadores);
    }

    public Set<String> obtenerDisciplinasDisponibles() {
        return new HashSet<>(disciplinasDisponibles);
    }

    public Set<Jugador> fusionarJugadoresDeEquipos(String disciplina1, String disciplina2) {
        HashSet<Jugador> jugadoresFusionados = new HashSet<>();
        
        for (Jugador jugador : jugadores) {
            if (jugador.estaInscritoEn(disciplina1.toLowerCase()) || 
                jugador.estaInscritoEn(disciplina2.toLowerCase())) {
                jugadoresFusionados.add(jugador);
            }
        }
        return jugadoresFusionados;
    }
    
    public List<Jugador> simularInscripcionesAleatorias() {
        List<Jugador> jugadoresConInscripciones = new ArrayList<>();
        Random random = new Random();
        
        for (Jugador jugador : jugadores) {
            List<String> disciplinasList = new ArrayList<>(disciplinasDisponibles);
            int numInscripciones = random.nextInt(3) + 1;
            
            for (int i = 0; i < numInscripciones && !disciplinasList.isEmpty(); i++) {
                int index = random.nextInt(disciplinasList.size());
                String disciplina = disciplinasList.remove(index);
                if (!jugador.estaInscritoEn(disciplina)) {
                    jugador.agregarDisciplina(disciplina);
                }
            }
            jugadoresConInscripciones.add(jugador);
        }
        return jugadoresConInscripciones;
    }
}

