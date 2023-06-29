/*
* Programa: Números primos
* Programador: Saúl Zúñiga
* Descripción: leer un numero entero de dos dígitos menor que 20 y determinar si es primo
* Revisión: Ninguna
*
* */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero de dos digitos menor a 50");
        int num = sc.nextInt();
        // Comprobando que no sea negativo o mayor que 20
            m = num / 2;
            if (num == 0 || num == 1) {
                System.out.println(num + " no es primo");
            } else {
                for( i = 2; i < m; i++){
                    if(num%i==0) {
                        System.out.println(num + " No es primo");
                        flag=1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(num + " es primo");
                }
            }
        }


    }

