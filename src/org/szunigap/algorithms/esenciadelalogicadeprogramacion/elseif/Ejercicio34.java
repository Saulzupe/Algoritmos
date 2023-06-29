/*
 * Programa: Ejercicios de lógica de programación  - LA esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción: Leer un número entero menor que mil y determinar cuántos dígitos tiene.
 *
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese otro número menor que mil :");
        numero = sc.nextInt();

        if ((numero <= 100) && numero >= 10) {
            System.out.println(" Es de 2 dígitos ");
        } else if ((numero < 1000) && numero >= 100) {
            System.out.println("Es de 3 dígitos");
        } else if ((numero < 10000) && numero >= 1000) {
            System.out.println("Es de 4 dígitos");

        } else {
            System.out.println("No es de dos dígitos");
        }
    }
}
