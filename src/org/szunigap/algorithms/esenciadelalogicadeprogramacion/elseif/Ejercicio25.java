// Programa: Ejercicio 25 Lógica de programación - Libro la esencia
// Programador: Saúl Zúñiga Pérez
// Descripción: * Leer un número entero de tres dígitos y determinar si alguno de sus dígitos
//                  es igual  a la suma de los otros dos

// Fecha: 04/08/22
// Revisión
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio25 {
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
            if ((digito1 + digito2 == digito3)) {
                System.out.println("La suma de los digitos: " + digito1 +
                        " " + digito2 + " es quivalente a: " + digito3);
            } else if ((digito2 + digito3 == digito1)){
                System.out.println("La suma de los digitos: " + digito2 +
                        " " + digito3 + " es quivalente a: " + digito1);
            } else if ((digito1 + digito3 == digito2)) {
                System.out.println("La suma de los digitos: " + digito1 +
                        " " + digito3 + " es quivalente a: " + digito2);
            } else {
                System.out.println("Los digitos no dan la suma");
            }

        }
}
}
