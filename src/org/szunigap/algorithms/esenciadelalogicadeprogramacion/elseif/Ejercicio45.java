/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción: Leer un número entero de 2 dígitos y si es par mostrar en pantalla la suma de
             sus dígitos, si es primo y menor que 10 mostrar en pantalla su último dígito
             Y si es múltiplo de 5 y menor que 30 mostrar en pantalla el primer dígito
Fecha:      18/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        int flag = 0;
        boolean primo = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero de 2 dígitos: (00) ");
        int numero = sc.nextInt();

        if ( numero < 100) {
            int dig1 = numero / 10;
            int dig2 = numero % 10;

            for (int i = 2; i < numero /2; i++) {
                if (numero%i == 0) {
                    primo = false;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                primo = true;
            }

            if (numero % 2 == 0) {
                int sumaDigitos = dig1 + dig2;
                System.out.println("La suma de los digitos de : " + numero + " es " + sumaDigitos);
            } else if ( (primo) && (numero < 10)){
                System.out.println("Último Dígito: " + dig2);
            } else if ((numero % 5 == 0) && (numero < 30)){
                System.out.println("Primer dígito: " + dig1);
            }

        } else {
            System.out.println("No es de dos dígitos...");
        }
    }
}
