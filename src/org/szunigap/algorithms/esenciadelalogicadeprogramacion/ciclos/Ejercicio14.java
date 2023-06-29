/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Mostrar en pantalla los primeros 20 multiplos de 3
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio14 {
    public static void main(String[] args) {

        System.out.println("Primeros 20 múltiplos de 3");

        int contador = 0;
        int N = 0;
        do {
            System.out.println(N);
            N += 3;
            contador++;
        } while (contador < 20);
    }
}
