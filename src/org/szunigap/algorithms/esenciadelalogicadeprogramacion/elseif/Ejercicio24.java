// Programa: Ejercicio 24 Lógica de programación - Libro la esencia
// Programador: Saúl Zúñiga Pérez
// Descripción:
//              * Leer un número entero de tres dígitos y determinar cuantos digitos pares tiene

// Fecha: 04/08/22
// Revisión

package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Ingrese un número (3 dígitos) : ");
        int numero = sc.nextInt();
        sc.close();

        // Comprobando que sea de tres dígitos
        if((numero < 1000) && (numero >= 100)) {
            // Extraemos los dígitos
            int digito1 = numero / 100;
            int aux = numero % 100;
            int digito2 = aux / 10;
            int digito3 = aux % 10;
            if( (digito1 % 2 == 0)) {
                contador++;
            }
            if( (digito2 % 2 == 0)) {
                contador++;
            }
            if( (digito3 % 2 == 0)) {
                contador++;
            }
            System.out.println(numero + " tiene: " + contador + " digitos pares");
        } else {
            System.out.println(" Tiene que ser de tres dígitos ");
        }
    }
}
