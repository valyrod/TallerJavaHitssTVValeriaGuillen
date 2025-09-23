package modelos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String id;
    private String nombre;
    private List<String> disciplinas;

    public Jugador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.disciplinas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void agregarDisciplina(String disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public void eliminarDisciplina(String disciplina) {
        disciplinas.remove(disciplina);
    }

    public boolean estaInscritoEn(String disciplina) {
        return disciplinas.contains(disciplina);
    }

    @Override
    public String toString() {
        return "ID: " + id + " - " + nombre + " - Disciplinas: " + disciplinas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jugador jugador = (Jugador) obj;
        return id.equals(jugador.id) || nombre.equalsIgnoreCase(jugador.nombre);
    }
}
