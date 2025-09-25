package test;

import java.time.LocalDate;
import models.*;

public class TestMain {
     public static void main(String[] args) {
        SistemaUniversitario sistema = new SistemaUniversitario();
        
        sistema.agregarEstudiante("E001", "Juan Perez");
        sistema.agregarEstudiante("E002", "Maria Garcia");
        sistema.agregarEstudiante("E003", "Carlos Lopez");
        
        sistema.agregarCurso("Matematicas", "Jaime Rodriguez", 
                           LocalDate.of(2024, 3, 1), LocalDate.of(2024, 6, 30));
        sistema.agregarCurso("Fisica", "Hernesto Martinez", 
                           LocalDate.of(2024, 4, 1), LocalDate.of(2024, 7, 31));
        sistema.agregarCurso("Quimica", "Laura Gonzalez", 
                           LocalDate.of(2024, 8, 1), LocalDate.of(2024, 11, 30));
        
        System.out.println("-__-__-__- Inscripcion de estudiantes -__-__-__-");
        System.out.println("Inscribir E001 en Matematicas: " + 
                         sistema.inscribirEstudianteEnCurso("E001", "Matematicas"));
        System.out.println("Inscribir E001 en Fisica (conflicto): " + 
                         sistema.inscribirEstudianteEnCurso("E001", "Fisica"));
        System.out.println("Inscribir E001 en Quimica: " + 
                         sistema.inscribirEstudianteEnCurso("E001", "Quimica"));
        System.out.println("Inscribir E002 en Fisica: " + 
                         sistema.inscribirEstudianteEnCurso("E002", "Fisica"));
        
        System.out.println("\n-__-__-__- Cursos del estudiante E001 -__-__-__-");
        for (Curso curso : sistema.listarCursosDeEstudiante("E001")) {
            System.out.println(curso);
        }
        
        System.out.println("\n-__-__-__- Cursos del profesor Jaime Rodriguez -__-__-__-");
        for (Curso curso : sistema.listarCursosDeProfesor("Jaime Rodriguez")) {
            System.out.println(curso);
        }
        
        System.out.println("\n-__-__-__- Cursos activos el 2024-05-15 -__-__-__-");
        for (Curso curso : sistema.listarCursosActivos(LocalDate.of(2024, 5, 15))) {
            System.out.println(curso);
        }
        
        System.out.println("\n-__-__-__- Retirar estudiante -__-__-__-");
        System.out.println("Retirar E001 de Matematicas: " + 
                         sistema.retirarEstudianteDeCurso("E001", "Matematicas"));
        
        System.out.println("\n-__-__-__- Cursos de E001 despues de retiro -__-__-__-");
        for (Curso curso : sistema.listarCursosDeEstudiante("E001")) {
            System.out.println(curso);
        }
    }
}







    
   

    




