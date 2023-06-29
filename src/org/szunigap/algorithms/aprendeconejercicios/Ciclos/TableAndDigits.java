package Ciclos;

import java.util.Scanner;

public class TableAndDigits {
    public static void main(String[] args) {
        // Muestra la tabla de multiplicar de un número introducido por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numeroIngresado = sc.nextInt();
        //Mostramos la tabla de multiplicar y realizamos el calculo
        /*for (int i = 0; i <= 10; i++) {
            System.out.println(numeroIngresado + " x " + i  +  " = " + (numeroIngresado * i));
        }*/

        // Cuantos digitos tiene un número
        int contador = 0;
         while (numeroIngresado != 0) {
             numeroIngresado /= 10;
             contador++;
         }
        System.out.println("Tiene " + contador + " digitos");
    }
}
