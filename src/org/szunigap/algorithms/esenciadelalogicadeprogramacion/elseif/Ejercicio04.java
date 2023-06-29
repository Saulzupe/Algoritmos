/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción: 1.- Leer un número entero de dos dígitos y determinar a cuánto
                  es igual a la suma de sus dígitos
             2.- Leer un número entero de dos dígitos y determinar si ambos dígitos son pares
             3.- Leer un número entero de dos dígitos
             menor que 20 y determinar si es primo
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número de dos digitos");
        int num = sc.nextInt();
        // Aplicando la Restricción debe ser de dos digitos
        if ((num >= 10 && num < 99)){
            //Determinamos la suma de sus digitos
            int suma = (num/10) + (num%10);
            System.out.println("La suma de sus digitos es: " + suma);

        } else {
            System.out.println("No es de dos digitos");
        }
    }
}
