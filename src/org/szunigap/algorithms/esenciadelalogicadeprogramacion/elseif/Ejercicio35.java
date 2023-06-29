/*
 * Programa: Ejercicios de lógica de programación  - LA esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción: - Leer un número entero de dos dígitos, guardar cada dígitos en una variable diferente
 *                   y luego mostrarla en pantalla
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero de dos dígitos: ");
        numero = sc.nextInt();
        if (numero < 100) {
            int dig1 = numero / 10;
            int dig2 = numero % 10;
            System.out.println(dig1 + " " + dig2);
        } else {
            System.out.println("No es de dos dígitos");
        }
    }
}
