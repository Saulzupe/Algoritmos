/*
Programa: Ejercicio 37 la esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción: Leer dos enteros y determinar cuál es múltiplo de cuál
Fecha: 10/08/22
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class MultiploDeCual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos números enteros: ");
         num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else if ( num2 % num1 == 0){
            System.out.println(num2 + " es multiplo de " + num1);
        } else {
            System.out.println("Ningúno es múltiplo de otro");
        }

    }
}
