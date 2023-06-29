/*
* Programa: Ejercicio 2.24 (Enteros menor y mayor)
* PRogramador: Saúl Zúñiga Pérez
* Descripción: Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros
*               mayor y menor en el grupo. Use solamente las técnicas de programación que aprendió en
*               este capítulo.*/
package org.szunigap.algorithms.deitel;


import java.util.Scanner;

public class Ejercicio2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un entero: ");
        int numero = sc.nextInt();
        System.out.print("Ingrese un entero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese un entero: ");
        int numero2 = sc.nextInt();
        System.out.print("Ingrese un entero: ");
        int numero3 = sc.nextInt();
        System.out.print("Ingrese un entero: ");
        int numero4 = sc.nextInt();

        int max = (numero > numero1) ? numero1 : numero2;
        max = (max > numero2) ? max : numero2;
        max = (max > numero3) ? max : numero3;
        max = (max > numero4) ? max : numero4;

        // obteniendo el minimo
        int min = (numero < numero1) ? numero1 : numero2;
        min = (min < numero2) ? max : numero2;
        min = (min < numero3) ? max : numero3;
        min = (min < numero4) ? max : numero4;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
