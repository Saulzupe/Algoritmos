/*
*  Programa: Ejercicio 2.34 Calculadora del crecimiento de la población mundial.
*  Programador: Saúl Zúñiga
*  Descripción: Use Web para determinar la población mundial actual y la tasa de crecimiento anual de la
*               población mundial. Escriba una aplicación que reciba estos valores como entrada y
*               luego muestre la población mundial estimada después de uno, dos, tres, cuatro y cinco años
* */
package org.szunigap.algorithms.deitel;

import java.util.Scanner;

public class Ejercicio2_34 {
    public static void main(String[] args) {
        double estimacion, estamacionAnio2,estamacionAnio3,estamacionAnio4, estamacionAnio5;
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Calculadora del crecimiento de la población mundial --");

        System.out.print("Población Mundial Actual: ");
        double poblacionMundial = sc.nextDouble();
        System.out.print("Tasa de crecimiento anual de la población mundial: ");
        double tasaCrecimiento = sc.nextDouble();
        System.out.print("Número de años: ");
        int anios = sc.nextInt();

        estimacion = ( poblacionMundial * ((tasaCrecimiento/100) + 1));

        if (anios <= 5 && anios > 1) {
            estimacion = ( poblacionMundial * ((tasaCrecimiento/100) + 1));
            estamacionAnio2 = estimacion * ((tasaCrecimiento/100) + 1);
            estamacionAnio3 = estamacionAnio2 * ((tasaCrecimiento/100) + 1);
            estamacionAnio4 =estamacionAnio3 * ((tasaCrecimiento/100) + 1);
            estamacionAnio5 = estamacionAnio4 * ((tasaCrecimiento/100) + 1);
            System.out.println("Población final año 2 -> " + estamacionAnio2);
            System.out.println("Población final año 3 -> " + estamacionAnio3);
            System.out.println("Población final año 4 -> " + estamacionAnio4);
            System.out.println("Población final año 5 -> " + estamacionAnio5);
        } else {
            System.out.printf("Población final: %3.4f",  estimacion);
        }




    }
}
