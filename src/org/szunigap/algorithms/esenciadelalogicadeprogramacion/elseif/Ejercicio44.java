/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción: Leer un número entero de 4 dígitos y determinar si el primer dígito es múltiplo
            de los otros dígitos.
Fecha:      18/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número de 4 dígitos: ");
        int numero = sc.nextInt();
        System.out.println("\nEspere...\n");

        if (numero >= 1000 && numero < 9999){
            int dig1 = numero / 1000;
            int aux = numero % 1000;
            int dig2 = aux  / 100;
            int aux2 = aux % 100;
            int dig3 = aux2 / 10;
            int dig4 = aux2 % 10;

            if (dig1 % dig2 == 0){
                System.out.println("El primer digito es multiplo del segundo");
            } else if (dig1 % dig3 == 0 ){
                System.out.println("El primer digito es multiplo del tercero");
            } else if (dig1 % dig4 == 0 ){
                System.out.println("El primer digito es multiplo del cuarto");
            } else {
                System.out.println("No es multiplo de ninguno");
            }
        } else {
            System.out.println("No es de 4 dígitos");
        }
    }
}
