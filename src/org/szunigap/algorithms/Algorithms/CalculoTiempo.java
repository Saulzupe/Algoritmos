/* Programa: Ejercicio 6 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción:Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =
√
2h
g siendo g = 9:81m/s2
 *  Fecha: 15/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class CalculoTiempo {
    public static void main(String[] args) {
        Scanner altura = new Scanner(System.in);

        double g = 9.81;

        System.out.println("Este programa calcula el timpo que tardará en caer un objeto desde una altura h ");
        System.out.println("Ingrese el valor de la altura h: ");
        double h = altura.nextDouble();

        if (h == 0) {
            System.out.println("No tiene solución");

        } else {
          double t = Math.sqrt((2*h)/g);
            System.out.println("El tiempo que tarda en caer el objeto es de = " + t + " s");
        }
    }
}
