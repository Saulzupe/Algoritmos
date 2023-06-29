/*
 *   Programa: Ejercicios lógica de programación - Libro la escencia
 *   Programador: Saúl Zúñiga Pérez
 *   Descripción:
 *               *  Leer un número entero de cuatro dígitos y determinar si el segundo es igual al penultiumo
 * Fecha:        08/08/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de 4 dígitos: ");
        int numero = sc.nextInt();
        boolean primo = false;
        if (numero < 50 && numero > 0){
           for (int i = 2; i < numero/2; i++) {
               if (numero%i == 0) {
                   primo = false;
                   break;
               } else {
                   primo = true;
               }
           }
           if (primo) {
               System.out.println("Es primo");
           } else {
               System.out.println("No es primo...");
           }
        } else {
            System.out.println("No es menor que 50...");
        }
    }
}
