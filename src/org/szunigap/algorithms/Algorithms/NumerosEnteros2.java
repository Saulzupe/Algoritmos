/*
* Programa: Numeros enteros
* Programador: Saúl Zúñiga
* Descripción; Leer un número entero y si es un dígito y además es menor que 5 escribir
*               su nombre en pantalla (El nombre del 1 es UNO, el nombre del 2 es DOS, etc).
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class NumerosEnteros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Digite un número entero: ");
        int num  = scanner.nextInt();

        if (num < 0) {
            num *= -i;
        }
       switch (num) {
           case 1:
               System.out.println("Uno");
               break;
           case 2:
               System.out.println("DOS");
               break;
           case 3:
               System.out.println("TRES");
               break;
           case 4:
               System.out.println("CUATRO");
               break;
           case 5:
               System.out.println("CINCO");
               break;
           default:
               System.out.println("Numero fuera de rango");
       }
    }
}
