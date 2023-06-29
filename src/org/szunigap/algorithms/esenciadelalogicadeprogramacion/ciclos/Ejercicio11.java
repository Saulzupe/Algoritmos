/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer un número entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos entre
                        un dígito y otro.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un entero de dos dígitos");
        int numero2 = sc.nextInt();
        if (numero2 < 100){
            int digito1 = numero2 / 10;
            int digito2 = numero2 % 10;

            if (digito1 < digito2) {
                int aux = digito1;
                while (aux < digito2){
                    System.out.println(aux);
                    aux++;
                }
            } else if (digito2 < digito1){
                int aux = digito2;
                while (aux< digito1){
                    System.out.println(aux);
                    aux++;
                }
            }
        } else {
            System.out.println("No es de dos dígitos");
        }

    }
}
