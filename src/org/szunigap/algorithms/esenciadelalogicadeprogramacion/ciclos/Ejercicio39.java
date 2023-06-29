/*
        Programa: Ejercicio 39 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Se define la serie de Fibonacci como la serie que comienza con los dígitos 1 y 0 y
                       va sumando progresivamente los dos último elementos de la serie.
        Fecha:      10/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio39 {
    public static void main(String[] args) {
        int fibonacci = 0, numero1 = 0, numero2 = 1;

        System.out.print(numero1 + " " + numero2 + "\t"); // Mostramos los primeros valores de la serie

        do{
            fibonacci = numero1 + numero2;  // Sumamos los primeros valores
            numero1=numero2; // Cambiamos los valores
            numero2 = fibonacci;

            System.out.print(" " + fibonacci + "\t"); // Imprimimos en línea
        }while (fibonacci < 10000);
    }
}
