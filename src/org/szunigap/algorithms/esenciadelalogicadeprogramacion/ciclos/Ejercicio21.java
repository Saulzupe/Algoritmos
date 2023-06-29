/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Leer un número entero y determinar a cuánto es la igual la suma de sus dígitos.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito, suma = 0;
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();
        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            suma  += digito; // Sumando los dígitos
            numero = numero / 10;
            }
        System.out.println("La suma de los dígitos es = " + suma);
        }
}

