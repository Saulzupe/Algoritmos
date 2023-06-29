/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción:
             * Leer un número entero y mostrar todos los pares comprendidos entre 1 y el número leído.
Fecha:      23/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Dígite un entero: ");
        numero = sc.nextInt();
        for (int i = 2; i < numero; i+=2){
            System.out.println("Pares: "+ i);
        }
    }
}
