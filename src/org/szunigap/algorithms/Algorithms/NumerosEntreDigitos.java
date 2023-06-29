/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Leer un número entero de tres dígitos y mostrar todos los enteros comprendidos entre 1 y cada
                        uno de los dígitos.

        Fecha:      23/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class NumerosEntreDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígite un número de tres dígitos: ");
        int numero = sc.nextInt();

        if (numero > 99 & numero < 1000) {
            int dig1 = numero / 100;
            int dig2 = (numero / 10) % 10;
            int dig3 = numero % 10;
            System.out.println("dig2 = " + dig2);
            for (int i = 1; i < dig1; i++){
               System.out.println("Dígito 1 = " + i);
           }
            for (int i = 1; i < dig2; i++){
                System.out.println("Dígito 2 = " + i);
            }
            for (int i = 1; i < dig3; i++){
                System.out.println("Dígito 3 = " + i);
            }
        } else {
            System.out.println("No es de 3 dígitos");
        }
    }
}
