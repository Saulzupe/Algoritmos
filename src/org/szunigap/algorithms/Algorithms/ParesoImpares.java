/*
Programa: Ejercicio 36 lógica de programación - La esencia de la lógica
Programador: Saúl Zúñiga
Descripción: Leer u número entero de 5 dígitos y determinar si tiene más dígitos pares o impares
Fecha: 10/08/22

 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class ParesoImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int par = 0, impar = 0;

        System.out.println("Ingresa un número de 4 dítigos");
        numero = sc.nextInt();

        if ( numero>=1000 && numero<9999){
            int dig1 = numero / 1000;
            int aux1 = numero % 1000;
            int dig2 = aux1 / 100;
            int aux2 = aux1 % 100;
            int dig3 = aux2 / 10;
            int dig4 = aux2 % 10;

            if (dig1 % 2== 0) {
                par++;
            } else {
                impar++;
            }
            if (dig2 % 2== 0) {
                par++;
            } else {
                impar++;
            }
            if (dig3 % 2== 0) {
                par++;
            } else {
                impar++;
            }
            if (dig4 % 2== 0) {
                par++;
            } else {
                impar++;
            }

            if (par > impar) {
                System.out.println("El número ingresado tiene más dígitos pares " + par + " <- par, impar -> " + impar);
            } else if (par == impar) {
                System.out.println("Tiene la misma cantidad de dígitos pares e impares " + par + " <- par, impar -> " + impar);
            } else {
                System.out.println("Tiene más dígitos impares " + par + " <- par, impar -> " + impar);
            }
        } else {
            System.out.println("Debe ser de 4 dígitos");
        }
    }
}
