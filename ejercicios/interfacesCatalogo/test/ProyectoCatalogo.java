package test;

import java.time.LocalDate;

import clasesabstractas.Producto;
import clasesconcretas.Comics;
import clasesconcretas.Phone;
import clasesconcretas.Libro;
import clasesconcretas.TvLcd;
import interfaces.IElectronico;
import interfaces.ILibro;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        Producto[] productos = new Producto[6];

        productos[0] = new Phone(1000, "Apple", "iPhone 13", "Midnight");
        productos[1] = new TvLcd(800, "Samsung", 55);
        productos[2] = new TvLcd(34000, "Sony", 40);
        productos[3] = new Libro(18000, LocalDate.of(2000, 1, 1), "Eric Gamma", "Elementos reusables POO", "Alguna Editorial");
        productos[4] = new Libro(14000, LocalDate.of(1995, 5, 10), "Martin Fowler", "UML Gota a Gota", "Alguna Editorial");
        productos[5] = new Comics(500, LocalDate.of(2020, 3, 15), "Stan Lee", "Spider-Man #1", "Marvel Comics", "Spider-Man");

        for (Producto p : productos) {
            System.out.println("\n========= INFORME =========");
            System.out.println("Tipo de Producto: " + p.getClass().getSimpleName());
            System.out.println("Precio: $" + p.getPrecio());
            System.out.printf("Precio de Venta: $%.2f\n" , p.getPrecioVenta());
            if (p instanceof IElectronico) {
                IElectronico e = (IElectronico) p;
                System.out.println("Fabricante: " + e.getFabricante());
                if (p instanceof Phone) {
                    Phone iphone = (Phone) p;
                    System.out.println("Modelo: " + iphone.getModelo());
                    System.out.println("Color: " + iphone.getColor());
                } else if (p instanceof TvLcd) {
                    TvLcd tv = (TvLcd) p;
                    System.out.println("Pulgadas: " + tv.getPulgada());
                }
            } else if (p instanceof ILibro) {
                ILibro l = (ILibro) p;
                System.out.println("Fecha de Publicación: " + l.getFechaPublicacion());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Editorial: " + l.getEditorial());
                if (p instanceof Comics) {
                    Comics comic = (Comics) p;
                    System.out.println("Personaje: " + comic.getPersonaje());
                }
            }
        }
    }
}

