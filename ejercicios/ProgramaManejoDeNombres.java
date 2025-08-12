package entrada;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, nombre3, nombreConcatenado;

        System.out.print("Ingrese el primer nombre: ");
        nombre1 = entrada.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        nombre2 = entrada.nextLine();

        System.out.print("Ingrese el tercer nombre: ");
        nombre3 = entrada.nextLine();

        // Primer nombre
        System.out.println("Segundo caracter en mayúscula: " + Character.toUpperCase(nombre1.charAt(1)));  // Obtiene el carácter en la posición 1 del primer nombre y la convierte en letra mayúscula
        System.out.println("Últimos dos caracteres: " + nombre1.substring(nombre1.length() - 2));   // Obtiene los últimos dos caracteres del primer nombre
        System.out.println("Concatenación del primer nombre: " + Character.toUpperCase(nombre1.charAt(1)) + "." + nombre1.substring(nombre1.length() - 2)); // Concatenación del primer nombre

        // Segundo nombre
        System.out.println("Segundo caracter en mayúscula: " + Character.toUpperCase(nombre2.charAt(1)));  // Obtiene el carácter en la posición 1 del segundo nombre y la convierte en letra mayúscula
        System.out.println("Últimos dos caracteres: " + nombre2.substring(nombre2.length() - 2));   // Obtiene los últimos dos caracteres del segundo nombre
        System.out.println("Concatenación del segundo nombre: " + Character.toUpperCase(nombre2.charAt(1)) + "." + nombre2.substring(nombre2.length() - 2)); // Concatenación del segundo nombre

        // Tercer nombre
        System.out.println("Segundo caracter en mayúscula: " + Character.toUpperCase(nombre3.charAt(1)));  // Obtiene el carácter en la posición 1 del tercer nombre y la convierte en letra mayúscula
        System.out.println("Últimos dos caracteres: " + nombre3.substring(nombre3.length() - 2));   // Obtiene los últimos dos caracteres del tercer nombre
        System.out.println("Concatenación del tercer nombre: " + Character.toUpperCase(nombre3.charAt(1)) + "." + nombre3.substring(nombre3.length() - 2)); // Concatenación del tercer nombre


        nombreConcatenado = Character.toUpperCase(nombre1.charAt(1)) + "." + nombre1.substring(nombre1.length() - 2) + "_" + Character.toUpperCase(nombre2.charAt(1)) + "." + nombre2.substring(nombre2.length() - 2) + "_" + Character.toUpperCase(nombre3.charAt(1)) + "." + nombre3.substring(nombre3.length() - 2); // Concatenación de los nombres
        System.out.println("Nombres concatenados: " + nombreConcatenado);

        entrada.close();
    }
    
   /*private static String extraerCaracter(String nombre){
        return Character.toUpperCase(nombre.charAt(1)) + "." + nombre.substring(nombre.length() - 2);
    }*/
}
