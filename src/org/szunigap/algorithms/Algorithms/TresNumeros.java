/*
 *  Programa: Ejercicio 11 Condicionales (Aprende Java con Ejercicios)
 *  Programador: Saúl Zúñiga
 *  Descripción: Escribe un programa que ordene tres números enteros introducidos por teclado
 * Fecha:        09/07/22
 * Revisión: Ninguna.
 * */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3 = 0;

        System.out.println("Ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scan.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = scan.nextInt();

        if ( (num1 > num2) && ( num1> num3)) {
            System.out.println(num1 + "," + num2 + "," + num3);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + "," + num1+ "," + num3);
        } else {
            System.out.println(num3+ "," + num2 + "," + num1);
        }
    }
}
