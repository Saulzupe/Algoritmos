/* Programa: Ejercicio 6
 *  Programador: Saul Zúñiga
 *  Descripción: Área de un triangulo
 *  Fecha: 11/05/22
 *  Revisión: Ninguna

 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class BaseTriangulo {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo ");
        float base = sr.nextFloat();
        System.out.println("Ingrese la altura del triangulo: ");
        float altura = sr.nextFloat();

        float area = (0.5f * (base * altura));

        System.out.println("El área del triangulo es: " + area);
    }
}
