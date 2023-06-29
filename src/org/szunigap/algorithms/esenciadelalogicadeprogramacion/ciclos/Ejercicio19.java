/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer un número entero y determinar si es primo.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();
        //Determinar si es primo el número leído
        Primo(numero);
    }
    public static void Primo(int num){
        boolean primo = false;
        int m = num/2;
        for (int i = 2; i <= m; i++){
            if (num%i==0){
                primo = false;
                break;
            } else {
                primo = true;
            }
        }
        if (primo){
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }
}
