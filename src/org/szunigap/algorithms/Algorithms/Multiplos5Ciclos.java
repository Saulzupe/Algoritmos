/*
Programa:  Ejercicio 1,2,3 (Aprende a programar con ejercicios java)
Programador: Saúl Zúñiga Pérez
Descripción: * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while
Fecha:      23/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.Algorithms;

public class Multiplos5Ciclos {
    public static void main(String[] args) {
        System.out.println("==== Utilizando for ====");
        for (int i = 0; i < 100; i++){
            System.out.println(i*5);
        }
        System.out.println("==== Utilizando while ====");
        int i = 0;
        while (i < 100) {
            System.out.println(i*5);
            i++;
        }

        System.out.println("==== Utilizando do while ====");
        int k = 0;
        do{
            System.out.println(k*5);
            k++;
        } while (k < 100);
    }
}
