// Programa: Logica de programación libro la esencia de la lógica ( tres digitos)
// Programador: Saúl Zúñiga Pérez
// Descripción:
//              * Leer un numero entero de tres dígitos y determinar en que posición esta el mayor dígito.
// Fecha: 01/08/22
// Revisión ninguna
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de tres dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero < 1000){
            int dig = numero / 100;
            int aux = numero % 100;
            int dig2 = aux / 10;
            int dig3 = aux % 10;

            // el mayor de los digitos:
            if ((dig > dig2) && (dig > dig3)) {
                System.out.println("El digito mayor esta en la posición 0: ");
            } else if ( (dig2 > dig) && (dig2 > dig3)){
                System.out.println("El digito mayor esta en la posición 1: ");
            } else {
                System.out.println("El digito mayor está en la posición 2: ");
            }


        } else {
            System.out.println("No es de 3 dígitos");
        }
    }
}
