/*
        Programa: Ejercicio40 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Leer un número de dos digitos y determinar si pertenece a la serie de Fibonacci
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, fibonacci, numeroLeido;

        numero1 = 0;
        numero2 = 1;
        System.out.print("Digite un número (2 digitos): ");
        numeroLeido = sc.nextInt();

        do {
            fibonacci = numero1 + numero2;
            if (numeroLeido == fibonacci) {
                System.out.println("Es parte de la serie de fibonacci");
            } else {
                System.out.println(numeroLeido + " no es de la serie ");
            }
            numero1 = numero2;
            numero2 = fibonacci;
        } while (fibonacci < 100);
    }
}
