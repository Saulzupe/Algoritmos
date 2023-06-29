/*
 *   Programa: Ejercicios lógica de programación - Libro la escencia
 *   Programador: Saúl Zúñiga Pérez
 *   Descripción:
 *               * Leer un número entero de de cuatro dígitos y determinar cuántos dígitos pares tiene.
 * Fecha:        08/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Ingrese un número de 4 dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 1000 && numero < 10000){

            int dig1 = numero / 1000;
            int aux = numero % 1000;
            int dig2 = aux / 100;
            int aux2 = aux % 100;
            int dig3 = aux2 / 10;
            int dig4 = aux2 % 10;
            System.out.println("\nContando digitos pares...");

            if (dig1%2==0) {
                contador++;
            }
            if (dig2%2==0) {
                contador++;
            }
            if (dig3%2==0) {
                contador++;
            }
            if (dig4%2==0) {
                contador++;
            }
            System.out.println("El número: " + numero + " tiene " + contador + " dígitos pares");

        } else {
            System.out.println("No es un número de 4 dígitos...");
        }
    }
}
