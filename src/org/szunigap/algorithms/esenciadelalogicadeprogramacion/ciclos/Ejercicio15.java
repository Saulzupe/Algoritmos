/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Escribir en pantalla el resultado de sumar los primeros 20 múltiplos de 3.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio15 {
    public static void main(String[] args) {
        int suma = 0;
        System.out.println("Primeros 20 múltiplos de 3");

        int contador = 0;
        int N = 0;
        do {
            System.out.println(N);
            N += 3;
            suma += N;
            contador++;
        } while (contador < 20);
        System.out.print("La suma de los primeros 20 múltiplos de 3 es : " + suma);
    }
}
