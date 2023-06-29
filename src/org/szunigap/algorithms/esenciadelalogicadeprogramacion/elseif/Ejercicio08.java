/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción:  Leer un número entero de dos dígitos y determinar si sus dos digitos son primos
Revisión:    Ninguna
Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dig1, dig2;
        System.out.print("Ingrese un número entero de dos dígitos: ");
        num = sc.nextInt();

        if ((num>= 10 && num < 100)) {
            dig1 = num / 10;
            dig2 = num % 10;
            if ((dig1 == 2 || dig1 == 3 || dig1 == 7) ||
                    (dig2 == 2 || dig2 == 3 || dig2 == 7)) {
                System.out.println("Algunos digitos del numero " + num + " Son primos");
            } else {
                System.out.println("No tiene digitos primos");
            }
        } else {
            System.out.println("No es de dos digitos...");
        }
    }
}
