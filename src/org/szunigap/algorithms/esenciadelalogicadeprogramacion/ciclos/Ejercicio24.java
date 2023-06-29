/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: Leer un número entero y determinar a cuánto es igual la suma de sus dígitos pares.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito,  sumaPares = 0;
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();
        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            if (digito % 2 == 0) {
                sumaPares += digito;
            }
            numero = numero / 10;
        }
        System.out.println("La suma de sus dígitos pares es = " + sumaPares);
    }
}
