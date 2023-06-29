/*
*  Programa: Ejercicio 2.28 - Diámetro, circunferencia y área de un círculo
*  Programador: Saúl Zúñiga
*  Descripción: Escriba una aplicación que reciba del usuario el radio de un círculo como un entero,
*               y que imprima el diámetro, la circunferencia y el área del círculo mediante el uso del
*               valor de punto flotante PI
* */
package org.szunigap.algorithms.deitel;

import java.util.Scanner;

public class Ejercicio2_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio;

        System.out.print("Ingrese el radio del circulo: ");
        radio = entrada.nextInt();

        System.out.printf("Diámetro: %d%n", (2 * radio) );
        System.out.printf("\"Circunferencia: \"%f%n" , (2 * Math.PI * radio));
        System.out.printf("Área:%f" , (Math.PI * Math.pow(radio,2)) );

    }
}
