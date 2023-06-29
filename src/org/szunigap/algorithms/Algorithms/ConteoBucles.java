/*
Programa:  Ejercicio 4,5,6 (Aprende a programar con ejercicios java)
Programador: Saúl Zúñiga Pérez
Descripción: * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while
Fecha:      23/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.Algorithms;

public class ConteoBucles {
    public static void main(String[] args) {
        System.out.println("Utilizando for");
        for (int i = 320; i >=160; i-=20){
            System.out.println(i);
        }
        System.out.println("Utilizando while");
        int i = 360;
        while (i >= 160){
            System.out.println(i);
            i-=20;
        }
        System.out.println("Utilizando do while");
        int j = 320;
        do {
            System.out.println(j);
            j-=20;
        }while (j>=160);
    }
}
