/*
    * Programa: Ejercicios de lógica de programación  - LA esencia de la lógica
    * Programador: Saúl Zúñiga
    * Descripción: - Leer un número entero y determina si es igual a 10.
    *
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Ingresa un número entero : ");
        numero = sc.nextInt();

        if (numero == 10) {
            System.out.println("El número entero es igual a 10");
        } else {
            System.out.println("No es igual a 10");
        }
    }
}
