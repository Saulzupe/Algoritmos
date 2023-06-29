/*
 * Programa: Ejercicios Lógica de programación - La esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción:
 *              * Leer dos números enteros y determinar si la diferencia entre los dos es un número par

 * Fecha: 12/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Ingresa dos números enteros -- ");
        System.out.print("\nPrimer número: ");
        int numero1 = sc.nextInt();
        System.out.print("\nSegundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 < numero2){
            int diferencia = numero2 - numero1;
            par(diferencia);

        } else if (numero2 < numero1){
            int diferencia = numero1 - numero2;
            par(diferencia);
        }
    }
    public static void par (int dif) {
        if (dif % 2 == 0) {
            System.out.println(dif + " es par");
        }
    }

}
