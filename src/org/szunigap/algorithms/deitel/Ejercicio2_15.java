/*
    Programa: Ejercicio 2.15 Como Programar en Java - Deitel
    Programador: Saúl Zúñiga
    Descripción: (Aritmética) Escriba una aplicación que pida al usuario que escriba dos números,
    que obtenga los números del usuario e imprima la suma, producto, diferencia y cociente (división)
     de los números
 */
package org.szunigap.algorithms.deitel;

import java.util.Scanner;

public class Ejercicio2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;
        System.out.println("Calculadora Básica...");
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();

        int suma = num + num2;
        System.out.println("suma = " + suma);
        int producto = num * num2;
        System.out.println("producto = " + producto);
        int diferencia = num - num2;
        System.out.println("diferencia = " + diferencia);
        int division = num / num2;
        System.out.println("division = " + division);
    }
}
