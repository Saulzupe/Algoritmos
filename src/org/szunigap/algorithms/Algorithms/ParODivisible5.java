/*
 *  Programa: Ejercicio 11 Condicionales (Aprende Java con Ejercicios)
 *  Programador: Saúl Zúñiga
 *  Descripción: Realiza un programa que diga si un número introducido por teclado es par y/o
                    divisible entre 5.
 * Fecha:        09/07/22
 * Revisión: Ninguna.
 * */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class ParODivisible5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Ingrese un número y te dire si es par o divisible entre 5");
        numero = scanner.nextInt();
        scanner.close();

        if ((numero % 2 == 0)){
            System.out.println("Es par ");
        } else {
            System.out.println("Es impar");
        }
        if ((numero % 5 == 0)){
            System.out.println("Es divisible entre 5 ");
        } else {
            System.out.println("No es divisible entre 5" );
        }

    }
}
