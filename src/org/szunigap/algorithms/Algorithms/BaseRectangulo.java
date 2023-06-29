/* Programa: Ejercicio 5
 *  Programador: Saul Zúñiga
 *  Descripción: Área de un rectangulo
 *  Fecha: 11/05/22
 *  Revisión: Ninunga

 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class BaseRectangulo {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        float base = sr.nextFloat();
        System.out.println("Ingrese la altura del rectangulo: ");
        float altura = sr.nextFloat();

        float area = base * altura;

        System.out.println("El área del rectangulo es: " + area);
    }
}
