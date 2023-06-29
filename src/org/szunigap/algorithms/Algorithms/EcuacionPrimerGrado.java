/* Programa: Ejercicio 5 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
b = 0).
 *  Fecha: 15/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class EcuacionPrimerGrado {
    public static void main(String[] args) {
        Scanner ec = new Scanner(System.in);
        System.out.println("El siguiente programa resuelve la ecuación ax + b = 0");
        System.out.println("Ingrese el valor de a: ");
        float a = ec.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        float b = ec.nextFloat();

        if (a == 0) {
            System.out.println("La ecuación no tiene solución ");
        } else {
            float x = -b/a;
            System.out.println("El valor de X = " + x);
        }
    }
}
