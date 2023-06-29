/*
 * Programa: Ejercicios Lógica de programación - La esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción:
 *             * Leer dos números enteros y determinar si la diferencia entre los dos es un número divisor
 *                  exacto de alguno de los dos números.
 * Fecha: 12/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Ingresa dos números enteros -- ");
        System.out.print("\nPrimer número: ");
        int numero1 = sc.nextInt();
        System.out.print("\nSegundo número: ");
        int numero2 = sc.nextInt();
        if (numero1 < numero2){
            int diferencia = numero2 - numero1;
            divisor(diferencia, numero1, numero2);
        } else if (numero2 < numero1){
            int diferencia = numero1 - numero2;
            divisor(diferencia, numero1, numero2);
        }
    }
    public static void divisor (int dif, int num1, int num2) {
        if(num1 / dif == 0) {
            System.out.println("La deferencia es un divisor exacto de: " + num1);
        } else if (num2 / dif == 0){
            System.out.println("La deferencia es un divisor exacto de: " + num2);
        } else {
            System.out.println("La diferencia no es divisor exacto de ninguno");
        }
    }
}
