/* Programa: Ejercicio 8
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3PIr^2h
 *  Fecha: 20/05/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class VolumenCono {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        double radio, h, volumen;
        System.out.println("Volumen de un Cono");
        System.out.println("Ingrese el radio: ");
        radio = rd.nextDouble();
        System.out.println("Ingrese una altura: ");
        h = rd.nextDouble();

        volumen = (double) ((Math.PI * Math.pow(radio,2) * h)/3) ;
        System.out.println("volumen = " + volumen);

    }
}
