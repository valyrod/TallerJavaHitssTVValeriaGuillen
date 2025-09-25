package models;

import java.time.LocalDate;
import java.util.*;

public class SistemaUniversitario {
    private Map<String, Curso> cursos;
    private Map<String, Estudiante> estudiantes;
    
    public SistemaUniversitario() {
        this.cursos = new HashMap<>();
        this.estudiantes = new HashMap<>();
    }
    
    public void agregarEstudiante(String id, String nombre) {
        estudiantes.put(id, new Estudiante(id, nombre));
    }
    
    public void agregarCurso(String nombre, String profesor, LocalDate fechaInicio, LocalDate fechaFin) {
        cursos.put(nombre, new Curso(nombre, profesor, fechaInicio, fechaFin));
    }
    
    public String inscribirEstudianteEnCurso(String idEstudiante, String nombreCurso) {
        Estudiante estudiante = estudiantes.get(idEstudiante);
        Curso curso = cursos.get(nombreCurso);
        
        if (estudiante == null) {
            return "Error: Estudiante no encontrado";
        }
        
        if (curso == null) {
            return "Error: Curso no encontrado";
        }
        
        for (Curso cursoExistente : cursos.values()) {
            if (cursoExistente.getEstudiantes().contains(estudiante) && 
                cursoExistente.tieneSolapamientoFechas(curso)) {
                return "Error: Conflicto de fechas con el curso " + cursoExistente.getNombre();
            }
        }
        
        if (curso.inscribirEstudiante(estudiante)) {
            return "Estudiante inscrito correctamente";
        } else {
            return "Error: El estudiante ya está inscrito en este curso";
        }
    }
    
    public String retirarEstudianteDeCurso(String idEstudiante, String nombreCurso) {
        Estudiante estudiante = estudiantes.get(idEstudiante);
        Curso curso = cursos.get(nombreCurso);
        
        if (estudiante == null) {
            return "Error: Estudiante no encontrado";
        }
        
        if (curso == null) {
            return "Error: Curso no encontrado";
        }
        
        if (curso.retirarEstudiante(estudiante)) {
            return "Estudiante retirado correctamente";
        } else {
            return "Error: El estudiante no estaba inscrito en este curso";
        }
    }
    
    public List<Curso> listarCursosDeEstudiante(String idEstudiante) {
        Estudiante estudiante = estudiantes.get(idEstudiante);
        List<Curso> cursosEstudiante = new ArrayList<>();
        
        if (estudiante != null) {
            for (Curso curso : cursos.values()) {
                if (curso.getEstudiantes().contains(estudiante)) {
                    cursosEstudiante.add(curso);
                }
            }
        }
        
        return cursosEstudiante;
    }
    
    public List<Curso> listarCursosDeProfesor(String profesor) {
        List<Curso> cursosProfesor = new ArrayList<>();
        
        for (Curso curso : cursos.values()) {
            if (curso.getProfesor().equals(profesor)) {
                cursosProfesor.add(curso);
            }
        }
        
        return cursosProfesor;
    }
    
    public List<Curso> listarCursosActivos(LocalDate fecha) {
        List<Curso> cursosActivos = new ArrayList<>();
        
        for (Curso curso : cursos.values()) {
            if (curso.estaActivo(fecha)) {
                cursosActivos.add(curso);
            }
        }
        
        return cursosActivos;
    }
}