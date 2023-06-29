/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción:
             * Leer un número entero y si es múltiplo de 4 mostrar en pantalla su mitad, si es múltiplo
             de 5 mostrar en pantalla su cuadrado y si es múltiplo de 6 mostrar en pantalla su
             primer dígito. Asumir que el número no es mayor que 100.
Fecha:      23/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        int dig1 = numero / 10;
        int dig2 = numero % 10;

        if (numero % 4 == 0) {
            System.out.println(numero + " es múltiplo de 4 ");

            primo(dig2);

            System.out.println("La mitad de " + numero + " es = " + (numero/2));
        } else if ( numero % 5 == 0) {
            System.out.println(numero + " es múltiplo de 5 ");
            System.out.println("El cuadrado de" + numero + " es: " + Math.pow(numero, 2));

        } else if (numero % 6 == 0){
            System.out.println(numero + " es múltiplo de 6 ");
            System.out.println("dig1 = " + dig1);
        }
    }

    public static void primo(int num){
        int flag = 0;
        for (int i = 2; i < num/2; i++){
            if (num % 2 ==0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Numero "  + num + " es primo");
        }
    }
}
