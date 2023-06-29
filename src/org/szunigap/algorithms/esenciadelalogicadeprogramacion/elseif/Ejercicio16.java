// Programa: Logica de programación libro la esencia de la lógica ( tres digitos)
// Programador: Saúl Zúñiga Pérez
// Descripción:
//              * Leer un número entero de tres dígitos y determinar si al menos dos de sus tres dígitos son iguales.
// Fecha: 01/08/22
// Revisión ninguna
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de tres dígitos: ");
        int numero = sc.nextInt();
        if (numero >= 100 && numero < 1000){
            int dig = numero / 100;
            int aux = numero % 100;
            int dig2 = aux / 10;
            int dig3 = aux % 10;
            // Buscando si hay digitos iguales
            if (((dig==dig2) || (dig==dig3)) ){
                System.out.println("tiene dos digitos iguales");
            } else if (dig2== dig3) {
                System.out.println("tiene dos digitos iguales");
            } else {
                System.out.println("Todos los digitos son diferentes");
            }

        } else {
            System.out.println("No es de 3 dígitos");
        }
    }
}
