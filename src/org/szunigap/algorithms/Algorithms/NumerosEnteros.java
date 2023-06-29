/*
* Programa: Numeros enteros
* Programador: Saúl Zúñiga
* Descripción: Leer un número entero y determinar si es positivo o negativo.
* Si es positivo determinar si tiene dos digitos y si es negativo determinar si tiene tres
* dígitos. Asumir que no puede entrar el número cero
* */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Digite un numero entero");
        n = scanner.nextInt();

        if (n > 0 ) {
            if ( n >= 10 && n <= 99) {
                System.out.println("El número es positivo y tiene dos dígitos");
            } else {
                System.out.println("El número es positivo y no tiene dos digitos");
            }
        } else {
            if (n >= -999 && n <= -100){
                System.out.println("El número es negativo y tiene tres dígitos");
            } else {
                System.out.println("El número es negativo y no tiene tres dígitos");
            }
        }
    }
}
