/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción:  Leer un número entero de dos dígitos y determinar si es negativo y primo
Revisión:    Ninguna
Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, dig1, dig2, aux;
        int flag = 0;
        System.out.print("Ingrese un número entero de dos dígitos: ");
        num = sc.nextInt();

            if ((num>= 10 && num < 100) || num < 0) {
                if (num < 0 ) {
                    System.out.println("Es negativo");
                    aux = -num;
                } else {
                    System.out.println("no es negativo ");
                    aux = num;
                }

                for (int i = 2; i < aux / 2; i++) {
                    if (aux % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(aux + "es primo");
                } else {
                    System.out.println("no es primo");
                }


            }
    }
}
