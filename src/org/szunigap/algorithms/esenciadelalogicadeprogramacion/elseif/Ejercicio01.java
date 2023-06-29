
/*
 * Programa: Ejercicios sencillos del libro La escencia de la lógica en Java
 * Programador: Saúl Zúñiga Pérez
 * Descripción:  Leer un número entero y determinar si es un número terminado en 4

 * Revisión:    Ninguna
 * Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = sc.nextInt();

        if (num == 4) {
            System.out.println("Es cuatro");
        } else if ( num % 10 == 4){
            System.out.println("Termina en 4");
        }else {
            System.out.println("No termina ni cuenta con el número cuatro");
        }

    }
}
