
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

/*
 * Programa: Ejercicios sencillos del libro La escencia de la lógica en Java
 * Programador: Saúl Zúñiga Pérez
 * Descripción:
 *               Leer un número entero y determinar si tiene 3 dígitos.

 * Revisión:    Ninguna
 * Fecha 22/07/22
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        if (num >  100 && num <= 999) {
            System.out.println("Tiene 3 digitos");
        } else {
            System.out.println("No tiene 3 digitos");
        }
    }
}
