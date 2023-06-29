/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer un número entero de 3 dígitos y determinar si tien el dígito 1
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dígite un entero de 3 dígitos");
        int numero3 = sc.nextInt();

        if (numero3 > 99 && numero3 < 999){
            while (numero3 != 0) {
                int digito = numero3 - numero3 / 10 * 10;

                if (digito == 1) {
                    System.out.println("Tiene el dígito 1 el número ");
                    break;
                } else  {
                    System.out.println("No se localizo el número 1");

                }
                numero3 = numero3 / 10;
            }
        } else {
            System.out.println("No es de tres dígitos");
        }

    }
}
