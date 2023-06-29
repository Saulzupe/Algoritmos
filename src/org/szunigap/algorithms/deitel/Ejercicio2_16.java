/*
* Programa: Ejercicio 2.16 Como programar en Java - Deitel
* Programador: Saúl Zúñiga
* Descripción: Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los
*               números del usuario y muestre el número más grande, seguido de las palabras "Es más grande"
*               . Si los números son iguales, imprima el mensaje "Estos son iguales".*/
package org.szunigap.algorithms.deitel;

import java.util.Scanner;
public class Ejercicio2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int numero = sc.nextInt();
        System.out.print("Ingrese otro entero: ");
        int numero2 = sc.nextInt();

        if (numero == numero2) {
            System.out.println("Estos son iguales");
        } else if (numero > numero2) {
            System.out.println(numero + " Es más grande");
        } else {
            System.out.println(numero2 + " Es más grande");
        }
    }
}
