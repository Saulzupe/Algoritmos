/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer un número entero y determinar a cuánto es igual la suma de todos los enteros comprendidos
                       entre 1 y el número leído.


        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un entero");
        int numero = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            suma =  suma + i;
        }
        System.out.println(suma);
    }

}
