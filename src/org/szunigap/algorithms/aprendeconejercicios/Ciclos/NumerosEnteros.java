package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 18 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que obtenga los números enteros comprendidos entre dos números
//                  Introducidos por teclado y validados como distintos, el programa debe empezar por
//              el menor de los enteros introducidos e ir incrementando de 7 en 7
// Fecha: Mayo - 2023
public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 != numero2) {
            if (numero1 > numero2){
                for (int i = numero2; i <= numero1; i+=7){
                    System.out.println(i);
                }
            } else {
                // Entonces el numero 2 es mayor
                for (int i = numero1; i <= numero2; i+=7){
                    System.out.println(i);
                }

            }
        }

    }
}
