/* Programa: Ejercicio 7 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción:Realiza un programa que calcule la media de tres notas.

 *  Fecha: 15/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);

        System.out.println("Calculando la media de tres notas");
        System.out.println("Ingrese la nota 1: ");
        float nota1 = nt.nextFloat();
        System.out.println("Ingrese la nota 2: ");
        float nota2 = nt.nextFloat();
        System.out.println("Ingrese la nota 3: ");
        float nota3 = nt.nextFloat();

        if (nota1 == 0 && nota2 == 0 && nota3 == 0){
            System.out.println("El alumno no cuenta con ninguna evaluación");
        }

        float promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio del alumno es = " + promedio);
        if (promedio <= 5f) {
            System.out.println("Insuficiente");
        } else if ( promedio >= 6f && promedio <7f) {
            System.out.println("Suficiente");
        } else if ( promedio >= 7f && promedio < 8f ) {
            System.out.println("Bien");
        } else if ( promedio >= 8f && promedio <= 9f ) {
            System.out.println("notable");
        } else {
            System.out.println("Sobresaliente");
        }

    }
}
