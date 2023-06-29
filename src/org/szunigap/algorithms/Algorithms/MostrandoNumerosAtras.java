/*
* Programa: Ejercicio 4 Aprende Java con Ejercicios
* Programador: Saúl Zúñiga Pérez
* Descripción: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilziando ciclo for, while
*               y do-while
* Fecha: 16/12/22
* Revisión: Ninguna
* */
package org.szunigap.algorithms.Algorithms;

public class MostrandoNumerosAtras {
    public static void main(String[] args) {
        System.out.println("Con for");
        for (int i = 320; i >= 160; i-=20){
            System.out.println("i = " + i);
        }
        System.out.println("///////////////////////");
        System.out.println("con while");
        int contador = 320;
        while (contador >= 160){
            System.out.println(contador);
            contador -= 20;
        }

        System.out.println("///////////////////////");
        System.out.println("con do - while");
        contador = 320;
        do{
            System.out.println("contador = " + contador);
            contador -= 20;
        } while (contador >= 160);
    }
}
