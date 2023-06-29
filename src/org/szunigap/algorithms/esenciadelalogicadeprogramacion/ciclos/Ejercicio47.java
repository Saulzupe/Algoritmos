/*
        Programa: Ejercicio 47 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Leer un número y calcular  a cuánto es igual la sumatoria de todos los factoriales de los
                        números comprendidos entre 1 y el número leído.
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial, suma=0;

        System.out.print("Digite un número : ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++){
                factorial = 1;
                for (int aux = 1; aux <= i; aux++){
                    factorial *= aux;
                }
                suma += factorial;

            }
        }
        System.out.println("La sumatoria entero entre 1 y " + numero + " es " + suma);
    }
}
