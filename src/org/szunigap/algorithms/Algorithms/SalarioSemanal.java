/* Programa: Ejercicio 8
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora.
 *  Fecha: 20/05/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner hrs = new Scanner(System.in);
        int total = 0;

        System.out.println("Ingrese las horas trabajadas: ");
        int horas = hrs.nextInt();

        if (horas <= 40) {
             total = horas * 12;
        } else if  ( horas >= 41){
             total = horas * 16;
        }
        System.out.println("total del salario semanal es de: " + total + "euros");
    }
}
