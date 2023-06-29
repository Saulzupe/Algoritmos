/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Lee un número entero y determinar a cuánto es igual el primer dígito.
                     * Leer un número entero y mostrar todos sus componentes numéricos o sea para
                        quienes el sea un múltiplo.
        Fecha:     04/09/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito = 0;
        System.out.print("Digite un número: ");
        int numero = sc.nextInt();

        while (numero != 0) {
            digito = numero % 10;

            numero = numero / 10;
        }
        System.out.println("El primero de sus digitos es: " + digito);


    }
}
