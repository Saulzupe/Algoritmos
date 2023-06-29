// Programa: Lógica de programación
// Programador: Saúl Zúñiga Pérez
// Descripción: * Leer un número entero de tres dígitos y determinar si el primer dígito es igual
//                  al último
//              * Leer un número entero de tres dígitos y determinar cuántos dígitos primos tiene
//              * Leer un número entero de tres dígitos y determinar cuantos digitos pares tiene

// Fecha: 04/08/22
// Revisión
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (3 dígitos) : ");
        int numero = sc.nextInt();
        sc.close();
        // Comprobando que sea de tres dígitos
        if((numero < 1000) && (numero >= 100)) {
            // Extraemos los dígitos
            int digito1 = numero / 100;
            int aux = numero % 100;
           // int digito2 = aux / 10;
            int digito3 = aux % 10;
            // Comprobando si el primer dígito es igual al último
            if(digito1 == digito3) {
                System.out.println("Los últimos digitos - > son iguales! ");
            } else {
                System.out.println("No son iguales! ");
            }

        } else {
            System.out.println(" Tiene que ser de tres dígitos ");
        }
    }
    }

