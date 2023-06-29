/* Programa: Ejercicio 3
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable y viceversa
 *  Fecha: 11/05/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConversorEurosPesetas {
    public static void main(String[] args) {
        Scanner cantidad = new Scanner(System.in);
        double peseta, conversion, inverso;
        System.out.println("Ingrese la cantidad de Euros: \t");
        double euros = cantidad.nextDouble();

        conversion = (euros * 166386);
        BigDecimal con = new BigDecimal(conversion).setScale(2, RoundingMode.HALF_UP);
        System.out.println("La cantidad de \t" + euros + "euros:\t " + " a pesetas es: \t" + conversion);

        System.out.println("Ingrese la cantidad de Pesetas:");

        double pesetas = cantidad.nextDouble();
        inverso = (pesetas / 166386) * 1000;
        System.out.printf("%nEl valor de la variable cantidad es %.2f", inverso);
    }
}
