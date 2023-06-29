/*
 * Programa: Ejercicio 2.16 Como programar en Java - Deitel
 * Programador: Saúl Zúñiga
 * Descripción: Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
promedio, producto, menor y mayor de esos números.
* Utilice las técnicas que se muestran en la figura 2.15 [nota: el
cálculo del promedio en este ejercicio debe dar como resultado una representación entera del promedio.
*  Por lo tanto,
si la suma de los valores es 7, el promedio debe ser 2, no 2.3333...].*/
package org.szunigap.algorithms.deitel;

import java.util.Scanner;

public class Ejercicio2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        int numero2 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        int numero3 = sc.nextInt();

        int suma = numero1 + numero2 + numero3;
        System.out.println("suma = " + suma);

        int promedio = suma / 3;
        System.out.println("promedio = " + promedio);

        int producto = numero1 * numero2 * numero3;
        System.out.println("produco = " + producto);

       int max = (numero1 > numero2) ? numero1: numero2;
        max = (max > numero3 ) ? max : numero3;
        System.out.println("max = " + max);
    }
}
