/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción:  leer dos numeros enteros y determinas si tienen digitos comunes
Revisión:    Ninguna
Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, dig1, dig2, dig3, dig4;
        System.out.print("Ingrese un número entero de dos dígitos: ");
        num = sc.nextInt();
        System.out.print("Ingrese otro número de dos digitos: ");
        num2 = sc.nextInt();

        if ((num >= 10 && num2 >= 10) && (num < 100 && num2 < 100)){
            dig1 = num / 10;
            dig2 = num % 10;
            dig3 = num2 / 10;
            dig4 = num2 % 10;
            // leer dos numeros enteros y determinas si tienen digitos comunes
            if ((dig1 == dig2) && (dig3 == dig4)) {
                System.out.println("Todos los digitos son iguales");
            } else if ( dig1 == dig3) {
                System.out.println("Los numeros: " + num + " y " + num2 + "tienen en común los digitos " +
                        dig1 + " " + dig3);
            } else if (dig2 == dig4 ) {
                System.out.println("Los numeros: " + num + " y " + num2 + "tienen en común los digitos " +
                        dig2 + " " + dig4);
            } else if ( dig2 == dig3) {
                System.out.println("Los numeros: " + num + " y " + num2 + "tienen en común los digitos " +
                        dig2 + " " + dig3);
            } else if ( dig1 == dig4) {
                System.out.println("Los numeros: " + num + " y " + num2 + "tienen en común los digitos " +
                        dig1 + " " + dig4);
            } else {
                System.out.println("Todos los digitos son diferentes");
            }

        } else {
            System.out.println("Alguno de los dos numeros ingresados no es de dos digitos...");
        }
    }
}
