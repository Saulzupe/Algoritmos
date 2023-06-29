/* Programa: número capicuo 5 digitos, la escencia de la lógica
    Programador: Saúl Zúñiga
    Descripción: Leer un número entero de cinco dígitos y determinar si es un número capicúo
    Fecha: 08/08/22
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número de 5 dígitos: ");
        int numero = scanner.nextInt();
        if (numero >= 10000 && numero < 99999){
            int dig1 = numero / 10000;
            int aux1 = numero % 10000;
            int dig2 = aux1 / 1000;
            int aux2 = aux1 % 1000;
            int dig3 = aux2 / 100;
            int aux3 = aux2 % 100;
            int dig4 = aux3 / 10;
            int dig5 = aux3 % 10;

           if( (dig1 == dig5) && (dig2 == dig4) && (dig3 == dig3) ) {
               System.out.println("El número: " + numero + " Es capicúo:");
           } else {
               System.out.println("No es capicúo");
           }

        }
    }
}
