/*
* Programa: Ejercicio 2.32 Valores negativos, positivos y cero
* Programador: Saúl Zúñiga Pérez
* Descripción: Escriba un programa que reciba cinco números, y determine e imprima la cantidad de números
*              negativos, positivos y la cantidad de ceros recibidos
* */
package org.szunigap.algorithms.deitel;

import java.util.Scanner;

public class Ejercicio2_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorNegativos = 0, contadorPositivos = 0, contadorCeros = 0;
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] < 0 ) {
                contadorNegativos++;
            }

            if (numeros[i] == 0) {
                contadorCeros++;
            }

            if (numeros[i] > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Negativos = " + contadorNegativos);
        System.out.println("Ceros = " + contadorCeros);
        System.out.println("Positivos = " + contadorPositivos);
    }
}
