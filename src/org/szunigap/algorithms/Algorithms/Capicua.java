/* Programa: Ejercicio 9 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 *  Fecha: 10/07/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean capicua = false;

        System.out.println("Introduzca un número entero (5 cifras como máximo): ");
        numero = scan.nextInt();

        // De una cifra
        if ( numero < 10) {
            capicua = true;
        }
        // Dos cifras
        if ((numero >= 10) && (numero < 100) ){
            if ((numero / 10) == (numero % 10)){
                capicua = true;
            }
        }
        // Tres cifras
        if ((numero >= 100) && (numero < 1000)) {
            if ((numero / 100) == (numero % 10)){
                capicua = true;
            }
        }

        if ((numero >= 1000) && (numero < 10000) ){
            if (((numero / 1000) == (numero % 10)) && (((numero / 100) %10) == ((numero/10)%10))){
                capicua = true;
            }
        }

        if ( numero >= 10000) {
            if (((numero / 10000) == (numero % 10)) && (((numero / 1000) %10) == ((numero/10)%10))) {
                capicua = true;
            }
        }

        if ( capicua) {
            System.out.println("El número que introdujo es capicua");
        } else {
            System.out.println("No es Capicua");
        }
    }
}
