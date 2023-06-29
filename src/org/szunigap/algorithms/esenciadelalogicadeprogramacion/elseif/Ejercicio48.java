/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción: * Leer un número entero y si es menor que 100 determinar si es primo.
Fecha:      23/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        if (numero < 100){
            primo(numero);
        }
    }
    public static void primo(int dig){
        boolean primo = false;
        for (int i = 2; i < dig/2; i++){
            if (dig % i ==0) {
                primo = false;
                break;
            } else {
                primo = true;
            }
        }
        if (primo) {
            System.out.println("Numero "  + dig + " es primo");
        } else {
            System.out.println("Numero "  + dig + " no es primo");
        }
    }
}
