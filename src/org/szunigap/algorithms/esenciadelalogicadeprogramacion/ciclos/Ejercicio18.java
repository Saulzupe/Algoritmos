/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:  Leer dos números enteros y mostrar todos los múltiplos de 5 comprendidos entre el menor y el mayor
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígite un entero: ");
        int numero = sc.nextInt();
        System.out.print("Dígite otro entero: ");
        int numero2 = sc.nextInt();
        if (numero > numero2) {
            for (int i = numero2; i <= numero; i++ ){
                if (i%5==0) {
                    System.out.println(i);
                }
            }
        } else if ( numero2 > numero) {
            for (int i = numero; i <= numero2; i++){
                if (i%5==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
