/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer un número entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos entre
                        un dígito y otro.


        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int digito = 0;
        System.out.print("Ingrese un entero de tres dígitos: ");
        int numero = entrada.nextInt();

        if (numero < 1000 && numero > 99) {
            while (numero != 0) {
                digito = numero - numero / 10 * 10;
                for (int i = 1; i <= digito; i++){
                    System.out.println(i);
                }
                System.out.println();
                numero = numero / 10;
            }


        }
    }
}
