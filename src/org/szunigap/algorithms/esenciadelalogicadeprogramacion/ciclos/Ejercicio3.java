/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción:
             * Leer un número entero y mostrar todos los divisores exactos del número comprendidos
             entre 1 y el número leído.
Fecha:      23/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Dígite un entero: ");
        numero = sc.nextInt();
        int j = 1;
        while (j <= numero) {
            if (numero % j == 0){
                System.out.println("divisores exactos " + j + " de " + numero);
            }
            j++;
        }
    }
}
