/* Programa: Ejercicio 9 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 *  Fecha: 10/07/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class ProgramacionNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota del primer control: ");
        float nota1 = scan.nextFloat();
        System.out.println("Nota del segundo control: ");
        float nota2 = scan.nextFloat();

        float promedio = (nota1 + nota2) / 2;
        if (promedio >= 5) {
            System.out.println("Tu nota de programación es: " + promedio);
        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto) ");
            String resultado = scan.next();
            scan.close();

            if (resultado.equalsIgnoreCase("apto")){
                promedio = 5;
                System.out.println("Resultado de la nota de recuperación: " + resultado);
                System.out.println("Tu nota de programación es: " + promedio);
            } else {
                System.out.println("Resultado de la nota de recuperación: " + resultado);
                System.out.println("Tu nota de programación es: " + promedio);
            }
        }
    }
}
