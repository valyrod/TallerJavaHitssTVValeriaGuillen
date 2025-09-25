package models;

import java.time.LocalDate;
import java.util.*;

public class Curso {
    private String nombre;
    private String profesor;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Set<Estudiante> estudiantes;
    
    public Curso(String nombre, String profesor, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estudiantes = new HashSet<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getProfesor() {
        return profesor;
    }
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    public Set<Estudiante> getEstudiantes() {
        return new HashSet<>(estudiantes);
    }
    
    public boolean tieneSolapamientoFechas(Curso otroCurso) {
        return !(this.fechaFin.isBefore(otroCurso.fechaInicio) || 
                 otroCurso.fechaFin.isBefore(this.fechaInicio));
    }
    
    public boolean inscribirEstudiante(Estudiante estudiante) {
        return estudiantes.add(estudiante);
    }
    
    public boolean retirarEstudiante(Estudiante estudiante) {
        return estudiantes.remove(estudiante);
    }
    
    public boolean estaActivo(LocalDate fecha) {
        return !fecha.isBefore(fechaInicio) && !fecha.isAfter(fechaFin);
    }
    
    @Override
    public String toString() {
        return "Curso: " + nombre + ", Profesor: " + profesor + 
               ", Inicio: " + fechaInicio + ", Fin: " + fechaFin;
    }
}
