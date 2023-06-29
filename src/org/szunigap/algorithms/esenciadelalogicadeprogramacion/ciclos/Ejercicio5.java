/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer dos números y mostrar todos los números terminados en 4 comprendidos entre ellos.

        Fecha:      23/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, digNumero1 = 0,digNumero2 = 0;
        System.out.print("Digíte un número: ");
        numero1 = sc.nextInt();
        System.out.print("Digíte un número: ");
        numero2 = sc.nextInt();

        System.out.println("Numeros terminados en 4");
        if(numero1 > numero2) {

            for (int i = numero2; i <= numero1; i++){
                int dig = i % 10;
                if ( dig == 4) {
                    System.out.println(i);
                }
            }
        }

        if(numero1 < numero2) {

            for (int i = numero1; i <= numero2; i++){
                int dig = i % 10;
                if ( dig == 4) {
                    System.out.println(i);
                }
            }
        }
    }
}
