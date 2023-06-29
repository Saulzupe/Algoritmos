// Programa: Logica de programación libro la esencia de la lógica ( tres digitos)
// Programador: Saúl Zúñiga Pérez
// Descripción: * Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus digitos
//              * Leer un número entero de tres dígitos y determinar si al menos dos de sus tres dígitos son iguales.
//              * Leer un numero entero de tres dígitos y determinar en que posición esta el mayor dígito.
//              * Leer un número entero de tres dígitos y determinar si algún dígito es múltiplo de los otros.
// Fecha: 01/08/22
// Revisión ninguna
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de tres dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero < 1000){
            int dig = numero / 100;
            int aux = numero % 100;
            int dig2 = aux / 10;
            int dig3 = aux % 10;
            // Suma de los digitos de numero ingresado por el usuario
            System.out.println("La suma de los dígitos de -> " + numero + " es: " + (dig+dig2+dig3));
            System.out.println();

            //Ejercicio18.multiplo(dig, dig2, dig3);

        } else {
            System.out.println("No es de 3 dígitos");
        }
    }
}
