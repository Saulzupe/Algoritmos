/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Leer dos números enteros y mostrar todos los enteros comprendidos entre ellos.


        Fecha:      23/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, digNumero1 = 0,digNumero2 = 0, aux;
        System.out.print("Digíte un número: ");
        numero1 = sc.nextInt();
        System.out.print("Digíte un número: ");
        numero2 = sc.nextInt();

       if (numero1 > numero2) {
            aux = numero2;
            while (aux < numero1) {
                System.out.println(aux);
                aux++;
            }
        } else if ( numero2 > numero1) {
            aux = numero1;
            while (aux < numero2) {
                System.out.println(aux);
                aux++;
            }
        }

    }
}
