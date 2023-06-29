/*
        Programa: Ejercicio 42 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y
                       2000
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio43 {
    public static void main(String[] args) {
        int numero1, numero2, fibonacci = 0, contador = 0;
        numero1 = 0; numero2 = 1;

        do{
            fibonacci = numero1 + numero2;

            if (fibonacci > 1000 && fibonacci < 2000) {
                contador++;
            }
            numero1 = numero2;
            numero2 = fibonacci;


        } while (fibonacci < 2500);
        System.out.println("la serie de fibonacci entre 1000 y 2000 tiene " + contador + " elementos");
    }
}
