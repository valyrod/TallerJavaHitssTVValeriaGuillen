package test;

import models.Empleado;
import models.Evaluacion;
import java.util.*;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1, "Ana García", "RH", 55000, "6");
        Empleado empleado2 = new Empleado(2, "Carlos López", "IT", 48000, "3");
        Empleado empleado3 = new Empleado(3, "María Rodríguez", "Ventas", 52000, "7");
        Empleado empleado4 = new Empleado(4, "Pedro Martínez", "IT", 75000, "10");
        Empleado empleado5 = new Empleado(5, "Laura Fernández", "Ventas", 45000, "2");
        Empleado empleado6 = new Empleado(6, "Javier Ruiz", "IT", 60000, "8");
        Empleado empleado7 = new Empleado(7, "Sofía Díaz", "Marketing", 48000, "4");
        Empleado empleado8 = new Empleado(8, "Luis Gómez", "RH", 52000, "5");
        Empleado empleado9 = new Empleado(9, "Elena Castro", "Marketing", 58000, "6");
        Empleado empleado10 = new Empleado(10, "David Romero", "Ventas", 62000, "9");

        List<Evaluacion> evaluacionesEmp1 = Arrays.asList(
            new Evaluacion(2022, 85),
            new Evaluacion(2023, 92),
            new Evaluacion(2024, 88)
        );
        
        List<Evaluacion> evaluacionesEmp2 = Arrays.asList(
            new Evaluacion(2023, 78),
            new Evaluacion(2024, 82)
        );
        
        List<Evaluacion> evaluacionesEmp3 = Arrays.asList(
            new Evaluacion(2022, 91),
            new Evaluacion(2023, 94),
            new Evaluacion(2024, 96)
        );
        
        List<Evaluacion> evaluacionesEmp4 = Arrays.asList(
            new Evaluacion(2024, 89)
        );
        
        List<Evaluacion> evaluacionesEmp5 = Arrays.asList(
            new Evaluacion(2023, 75),
            new Evaluacion(2024, 79)
        );
        
        List<Evaluacion> evaluacionesEmp6 = Arrays.asList(
            new Evaluacion(2024, 95)
        );
        
        List<Evaluacion> evaluacionesEmp7 = Arrays.asList(
            new Evaluacion(2023, 87),
            new Evaluacion(2024, 91)
        );
        
        List<Evaluacion> evaluacionesEmp8 = Arrays.asList(
            new Evaluacion(2023, 83),
            new Evaluacion(2024, 86)
        );
        
        List<Evaluacion> evaluacionesEmp9 = Arrays.asList(
            new Evaluacion(2022, 88),
            new Evaluacion(2023, 92),
            new Evaluacion(2024, 90)
        );
        
        List<Evaluacion> evaluacionesEmp10 = Arrays.asList(
            new Evaluacion(2024, 93)
        );

        Map<Empleado, List<Evaluacion>> empleadosConEvaluaciones = new HashMap<>();
        empleadosConEvaluaciones.put(empleado1, evaluacionesEmp1);
        empleadosConEvaluaciones.put(empleado2, evaluacionesEmp2);
        empleadosConEvaluaciones.put(empleado3, evaluacionesEmp3);
        empleadosConEvaluaciones.put(empleado4, evaluacionesEmp4);
        empleadosConEvaluaciones.put(empleado5, evaluacionesEmp5);
        empleadosConEvaluaciones.put(empleado6, evaluacionesEmp6);
        empleadosConEvaluaciones.put(empleado7, evaluacionesEmp7);
        empleadosConEvaluaciones.put(empleado8, evaluacionesEmp8);
        empleadosConEvaluaciones.put(empleado9, evaluacionesEmp9);
        empleadosConEvaluaciones.put(empleado10, evaluacionesEmp10);

        List<Empleado> empleados = new ArrayList<>(empleadosConEvaluaciones.keySet());

        System.out.println("===\n SISTEMA DE RECURSOS HUMANOS ===\n");

        System.out.println("\n1. Empleados del Departamento de Ventas (orden alfabético):");
        empleados.stream()
                .filter(e -> e.getDepartamento().equals("Ventas"))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .forEach(e -> System.out.println(" - " + e.getNombre() + 
                        " (" + e.getAniosExperiencia() + " años, $" + e.getSalario() + ")"));

        System.out.println("\n2. Salario promedio por departamento:");
        Map<String, Double> salarioPromedioPorDepto = empleados.stream()
                .collect(Collectors.groupingBy(
                    Empleado::getDepartamento,
                    Collectors.averagingDouble(Empleado::getSalario)
                ));
        salarioPromedioPorDepto.forEach((depto, promedio) -> 
            System.out.println(" - " + depto + ": $" + String.format("%,.2f", promedio)));

        System.out.println("\n3. Empleado con mayor salario:");
        empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario))
                .ifPresent(emp -> System.out.println(" - " + emp.getNombre() + 
                        " (" + emp.getDepartamento() + ") - $" + emp.getSalario()));

        System.out.println("\n4. Empleados con más de 5 años y salario mayor a 50,000:");
        empleados.stream()
                .filter(e -> {
                    try {
                        int anios = Integer.parseInt(e.getAniosExperiencia());
                        return anios > 5;
                    } catch (NumberFormatException ex) {
                        return false;
                    }
                })
                .filter(e -> e.getSalario() > 50000)
                .sorted(Comparator.comparing(Empleado::getNombre))
                .forEach(e -> System.out.println(" - " + e.getNombre() + 
                        " (" + e.getDepartamento() + ") - " + e.getAniosExperiencia() + 
                        " años - $" + e.getSalario()));

        System.out.println("\n5. Top 3 Mejor Puntaje en Evaluación 2024:");
        empleadosConEvaluaciones.entrySet().stream()
                .filter(entry -> entry.getValue().stream()
                        .anyMatch(eval -> eval.getAnio() == 2024))
                .sorted((e1, e2) -> {
                    int puntaje1 = e1.getValue().stream()
                            .filter(eval -> eval.getAnio() == 2024)
                            .mapToInt(Evaluacion::getPuntaje)
                            .max()
                            .orElse(0);
                    int puntaje2 = e2.getValue().stream()
                            .filter(eval -> eval.getAnio() == 2024)
                            .mapToInt(Evaluacion::getPuntaje)
                            .max()
                            .orElse(0);
                    return Integer.compare(puntaje2, puntaje1); 
                })
                .limit(3)
                .forEach(entry -> {
                    int puntaje2024 = entry.getValue().stream()
                            .filter(eval -> eval.getAnio() == 2024)
                            .mapToInt(Evaluacion::getPuntaje)
                            .max()
                            .orElse(0);
                    System.out.println(" - " + entry.getKey().getNombre() + 
                            " (" + entry.getKey().getDepartamento() + "): " + 
                            puntaje2024 + " puntos");
                });
                
        System.out.println("\n6. Empleados con al menos una evaluación mayor a 90 puntos:");
        long count = empleadosConEvaluaciones.entrySet().stream()
                .filter(entry -> entry.getValue().stream()
                        .anyMatch(eval -> eval.getPuntaje() > 90))
                .count();
        System.out.println("Cantidad: " + count + " empleados");

        System.out.println("\n7. Ranking de promedio de puntajes por empleado:");
        empleadosConEvaluaciones.entrySet().stream()
                .collect(Collectors.toMap(
                    entry -> entry.getKey(),
                    entry -> entry.getValue().stream()
                            .mapToInt(Evaluacion::getPuntaje)
                            .average()
                            .orElse(0.0)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<Empleado, Double>comparingByValue().reversed())
                .forEach(entry -> {
                    System.out.println(String.format(" - %s: %.2f pts (%s)", 
                            entry.getKey().getNombre(), entry.getValue(),
                            entry.getKey().getDepartamento()));
                });

    }
}
