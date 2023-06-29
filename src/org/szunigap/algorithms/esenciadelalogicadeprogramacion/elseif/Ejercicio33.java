/*
 * Programa: Ejercicios de lógica de programación  - LA esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción:
 *              -  Leer un número entero y determina si termina en 7.

 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Ingresa un número entero : ");
        numero = sc.nextInt();

         if ((numero % 10 == 7) || (numero % 100 == 7)) {
            System.out.println(" Termina en 7");
        } else {
            System.out.println("No  termina en 7");
        }

    }
}
