/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción:
             Leer un número entero de dos dígitos y determinar si los dos digitos son iguales

Revisión:    Ninguna
Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dig1, dig2;
        System.out.print("Ingrese un número entero de dos dígitos: ");
        num = sc.nextInt();
        if ((num>= 10 && num < 100)) {
            dig1 = num / 10;
            dig2 = num % 10;

            if (dig1 == dig2) {
                System.out.println("los digitos son iguales");
            } else {
                System.out.println("los digitos no son iguales");
            }
        } else {
            System.out.println("no es de dos digitos");
        }
    }
}
