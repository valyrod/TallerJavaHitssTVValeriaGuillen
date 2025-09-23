package modelos;

import test.TestMain;
import modelos.GestorTorneo;

public class  GenerarJugadores{
    
    public static void registrarJugadoresDeEjemplo(GestorTorneo gestor) {
        
        // Jugadores de futbol
        gestor.registrarJugador("F001", "Carlos Rodriguez");
        gestor.inscribirJugadorEnDisciplina("F001", "futbol");
        
        gestor.registrarJugador("F002", "Miguel Santos");
        gestor.inscribirJugadorEnDisciplina("F002", "futbol");
        
        gestor.registrarJugador("F003", "Diego Martinez");
        gestor.inscribirJugadorEnDisciplina("F003", "futbol");
        
        gestor.registrarJugador("F004", "Roberto Jimenez");
        gestor.inscribirJugadorEnDisciplina("F004", "futbol");
        
        gestor.registrarJugador("F005", "Fernando Lopez");
        gestor.inscribirJugadorEnDisciplina("F005", "futbol");
        
        gestor.registrarJugador("F006", "Alejandro Torres");
        gestor.inscribirJugadorEnDisciplina("F006", "futbol");
        
        gestor.registrarJugador("F007", "Andres Morales");
        gestor.inscribirJugadorEnDisciplina("F007", "futbol");
        
        gestor.registrarJugador("F008", "Sebastian Ruiz");
        gestor.inscribirJugadorEnDisciplina("F008", "futbol");
        
        // Jugadores de basquetball
        gestor.registrarJugador("B001", "Luis Garcia");
        gestor.inscribirJugadorEnDisciplina("B001", "basquetbol");
        
        gestor.registrarJugador("B002", "Antonio Mendez");
        gestor.inscribirJugadorEnDisciplina("B002", "basquetbol");
        
        gestor.registrarJugador("B003", "Jorge Herrera");
        gestor.inscribirJugadorEnDisciplina("B003", "basquetbol");
        
        gestor.registrarJugador("B004", "Rafael Castillo");
        gestor.inscribirJugadorEnDisciplina("B004", "basquetbol");
        
        gestor.registrarJugador("B005", "Eduardo Vargas");
        gestor.inscribirJugadorEnDisciplina("B005", "basquetbol");
        
        gestor.registrarJugador("B006", "Gabriel Ortiz");
        gestor.inscribirJugadorEnDisciplina("B006", "basquetbol");
        
        gestor.registrarJugador("B007", "Daniel Flores");
        gestor.inscribirJugadorEnDisciplina("B007", "basquetbol");
        
        gestor.registrarJugador("B008", "Ricardo Medina");
        gestor.inscribirJugadorEnDisciplina("B008", "basquetbol");
        
        // Jugadores de voleibol
        gestor.registrarJugador("V001", "Ana Gutierrez");
        gestor.inscribirJugadorEnDisciplina("V001", "voleibol");
        
        gestor.registrarJugador("V002", "Maria Fernandez");
        gestor.inscribirJugadorEnDisciplina("V002", "voleibol");
        
        gestor.registrarJugador("V003", "Carmen Silva");
        gestor.inscribirJugadorEnDisciplina("V003", "voleibol");
        
        gestor.registrarJugador("V004", "Laura Ramirez");
        gestor.inscribirJugadorEnDisciplina("V004", "voleibol");
        
        gestor.registrarJugador("V005", "Sofia Castro");
        gestor.inscribirJugadorEnDisciplina("V005", "voleibol");
        
        gestor.registrarJugador("V006", "Valeria Diaz");
        gestor.inscribirJugadorEnDisciplina("V006", "voleibol");
        
        gestor.registrarJugador("V007", "Paola Moreno");
        gestor.inscribirJugadorEnDisciplina("V007", "voleibol");
        
        gestor.registrarJugador("V008", "Cristina Aguilar");
        gestor.inscribirJugadorEnDisciplina("V008", "voleibol");
        
        // Jugadores de natación
        gestor.registrarJugador("N001", "Andrea Romero");
        gestor.inscribirJugadorEnDisciplina("N001", "natacion");
        
        gestor.registrarJugador("N002", "Javier Peña");
        gestor.inscribirJugadorEnDisciplina("N002", "natacion");
        
        gestor.registrarJugador("N003", "Isabella Cruz");
        gestor.inscribirJugadorEnDisciplina("N003", "natacion");
        
        gestor.registrarJugador("N004", "Mateo Guerrero");
        gestor.inscribirJugadorEnDisciplina("N004", "natacion");
        
        gestor.registrarJugador("N005", "Camila Reyes");
        gestor.inscribirJugadorEnDisciplina("N005", "natacion");
        
        gestor.registrarJugador("N006", "Samuel Vega");
        gestor.inscribirJugadorEnDisciplina("N006", "natacion");
        
        gestor.registrarJugador("N007", "Natalia Campos");
        gestor.inscribirJugadorEnDisciplina("N007", "natacion");
        
        gestor.registrarJugador("N008", "Emilio Sandoval");
        gestor.inscribirJugadorEnDisciplina("N008", "natacion");
        
        gestor.inscribirJugadorEnDisciplina("F001", "basquetbol");
        gestor.inscribirJugadorEnDisciplina("B001", "futbol");     
        gestor.inscribirJugadorEnDisciplina("V001", "natacion");   
        gestor.inscribirJugadorEnDisciplina("N002", "voleibol");  
        
        System.out.println("¡32 jugadores cargados exitosamente!");
        System.out.println("- 8 en futbol (algunos tambien en basquetbol)");
        System.out.println("- 8 en basquetbol (algunos tambien en futbol)");
        System.out.println("- 8 en voleibol (algunos tambien en natacion)");
        System.out.println("- 8 en natacion (algunos tambien en voleibol)");
        System.out.println();
    }
}