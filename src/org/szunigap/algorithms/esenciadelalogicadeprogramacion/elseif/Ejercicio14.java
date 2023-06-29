/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción: Leer dos numeros enteros de dos digitos y determinar a cuánto equivale la suma
             de sus digitos
Revisión:    Ninguna
Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, dig1, dig2, dig3, dig4, suma = 0;
        System.out.print("Ingrese un número entero de dos dígitos: ");
        num = sc.nextInt();
        System.out.print("Ingrese otro número de dos digitos: ");
        num2 = sc.nextInt();

        if ((num >= 10 && num2 >= 10) && (num < 100 && num2 < 100)) {
            dig1 = num / 10;
            dig2 = num % 10;

            dig3 = num2 / 10;
            dig4 = num2 % 10;
            suma = (dig1 + dig2) + (dig3 + dig4);
            System.out.println("suma = " + suma);
        } else {
            System.out.println("Alguno de los dos numeros ingresados no es de dos digitos...");
        }
    }
}
