package main;

import clases.Cliente;
import clases.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
            "Juan",
            "López",
            "12345678A",
            "Calle Libertad 48",
            50000.0,
            1001,
            100000.0
        );

        Cliente cliente = new Cliente(
            "Ana",
            "García",
            "87654321B",
            "Av El Cortijo 124",
            2001
        );

        System.out.println(gerente.toString());

        gerente.aumentarRemuneracion(10);
        gerente.setPresupuesto(120000.0);

        System.out.println("\nDespués de aumentar remuneración y cambiar presupuesto: \n");
        System.out.println("=======DATOS DEL GERENTE=========");
        System.out.println(gerente.toString());
        System.out.println("=========DATOS DEL CLIENTE=========");
        System.out.println(cliente.toString());
    }
}

