/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Leer un número entero y determinar cuál es el mayor de sus dígitos.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();
        int max = 0;
        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            if (max < digito){ // Obteniendo el máximo
                max = digito;
            }
            numero = numero / 10;
        }
        System.out.println("El dígito mayor es " + max );
    }
}
