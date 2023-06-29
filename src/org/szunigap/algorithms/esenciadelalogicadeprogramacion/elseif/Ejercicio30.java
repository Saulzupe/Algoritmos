/*
 *   Programa: Ejercicios lógica de programación - Libro la escencia
 *   Programador: Saúl Zúñiga Pérez
 *   Descripción:
 *               *  Leer un número entero de cuatro dígitos y determinar si el segundo es igual al penultiumo
 * Fecha:        08/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Ingrese un número de 4 dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 1000 && numero < 10000){

            //int dig1 = numero / 1000;
            int aux = numero % 1000;
            int dig2 = aux / 100;
            int aux2 = aux % 100;
            int dig3 = aux2 / 10;
           // int dig4 = aux2 % 10;
            String comparar = (dig2 == dig3) ? "Los digitos son iguales" : "No son iguales";

            System.out.println("comparar = " + comparar);

        } else {
            System.out.println("No es un número de 4 dígitos...");
        }
    }
}
