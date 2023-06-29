/*
 * Programa: Ejercicios Lógica de programación - La esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción:
 *              * Leer dos números enteros y determinar si la diferencia entre los dos es un nnúmero primo
 * Fecha: 12/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Ingresa dos números enteros -- ");
        System.out.print("\nPrimer número: ");
        int numero1 = sc.nextInt();
        System.out.print("\nSegundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 < numero2) {
            int diferencia = numero2 - numero1;
            primo(diferencia);
        } else if (numero2 < numero1) {
            int diferencia = numero1 - numero2;
            primo(diferencia);
        }
    }
    public static void primo(int dif) {
        int flag = 0;
        for (int i = 2; i < dif / 2; i++) {
            if (dif % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}