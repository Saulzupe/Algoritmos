/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Leer un entero y mostrar todos los múltiplos de 5 comprendidos entre 1 y el número leído.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Dígite un entero: \t");
        int numero = sc.nextInt();

        System.out.println("Múltiplos de 5 de 1 al número leído");
        int aux = 1;
        while ( aux <= numero){
            if (aux % 5 == 0){
                System.out.println(aux);
            }
            aux++;
        }

    }
}
