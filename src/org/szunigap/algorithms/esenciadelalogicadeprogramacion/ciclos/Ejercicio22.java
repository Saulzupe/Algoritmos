/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:  Leer un número entero y determinar cuántas veces tiene el dígito 1
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();
        int conteo = 0;
        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            if (digito == 1) { // Contando cuantas veces tiene el dígito 1
                conteo++;
            }
            numero = numero / 10;
        }
        System.out.println("El número ingresado tiene: " + conteo + " el número 1");
    }
}
