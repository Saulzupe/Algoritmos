/*
 * Programa: Ejercicios Lógica de programación - La esencia de la lógica
 * Programador: Saúl Zúñiga
 * Descripción: * Leer dos números enteros y si la diferencia entre los dos es menor o igual a 10 entonces
 *               mostrar en pantalla todos los enteros comprendidos entre el menor y el mayor de los números leídos
 *              * Leer dos números enteros y determinar si la diferencia entre los dos es un nnúmero primo
 *              * Leer dos números enteros y determinar si la diferencia entre los dos es un número par
 *              * Leer dos números enteros y determinar si la diferencia entre los dos es un número divisor
 *                  exacto de alguno de los dos números.
 * Fecha: 12/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Ingresa dos números enteros -- ");
        System.out.print("\nPrimer número: ");
        int numero1 = sc.nextInt();
        System.out.print("\nSegundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 < numero2){
            int diferencia = numero2 - numero1;
            if (diferencia <= 10) {
                conteo(numero1, numero2);
            }
        } else if (numero2 < numero1){
            int diferencia = numero1 - numero2;
            if (diferencia <= 10) {
                conteo(numero2, numero1);
            }
        }
    }

    public static void conteo (int num1, int num2){
        for (int i = num1; i <= num2; i++ ){
            System.out.println("numeros: " + i);
        }

    }

}
