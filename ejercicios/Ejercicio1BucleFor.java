package ciclos;

import java.util.Scanner;

public class Ejercicio1BucleFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int signo = 1;
       
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

       

        if (num1 < 0) {
            signo = -signo; // aqui el numero es negativoasi que lo cambio a positivo y guardo el estado del signo
            num1 = -num1;
        }
        if (num2 < 0) {
            signo = -signo;
            num2 = -num2;
        }

        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        resultado = signo == -1 ? -resultado : resultado;



        System.out.println("El resultado es: " + resultado);
    }
}
