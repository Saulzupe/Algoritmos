/*
 * Programa: Ejercicios de lógica de programación  - LA esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción:
 *              - Leer un número entero y determinar si es múltiplo de 7.

 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Ingresa un número entero : ");
        numero = sc.nextInt();

        if (numero % 7 == 0) {
            System.out.println(" Es múltiplo de 7 ");
        } else {
            System.out.println("no es multiplo");
        }
    }
}
