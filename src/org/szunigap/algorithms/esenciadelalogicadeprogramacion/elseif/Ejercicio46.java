/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción: * Leer un número entero de 2 dígitos y si termina en 1 mostrar en pantalla su
             primer dígito, si termina en 2 mostrar en pantalla la suma de sus dígitos y si
             termina en 3 mostrar en pantalla el producto de sus dos dígitos


Fecha:      22/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de 2 dígitos (00) : ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero < 100) {
            int dig1 = numero / 10;
            int dig2 = numero % 10;

            if (dig2 == 1) {
                System.out.println(dig1);
            } else if ( dig2 == 2) {
                int suma = dig1 + dig2;
                System.out.println("suma de los dígitos = " + suma);
            } else if ( dig2 == 3) {
                int producto = dig1 * dig2;
                System.out.println("producto = " + producto);
            } else {
                System.out.println("No cumple con ninguna de las condiciones");
            }
        } else {
            System.out.println("No es de dos dígitos...");
        }
    }
}
