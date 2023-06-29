/*
 * Programa: Ejercicios sencillos del libro La escencia de la lógica en Java
 * Programador: Saúl Zúñiga Pérez
 * Descripción: Leer un número entero y determinar si es negativo.
 * Revisión:    Ninguna
 * Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Es negativo");
        }
    }
}
