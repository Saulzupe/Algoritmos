/*
        Programa: Ejercicio 45 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Leer un número y calcularle su factorial a todos los enteros comprendidos entre 1
        y el número leído
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Digite un número : ");
        int numero = entrada.nextInt();


            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
                System.out.println("El factorial de " + i + " es: " + factorial);
            }




    }
}
