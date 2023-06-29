/* Programa: Ejercicio 9 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.
 *  Fecha: 16/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Te decimos tu horóscopo");
        System.out.println("Ingrese el día de nacimiento (00): ");
        int dia = scann.nextInt();
        System.out.println("Ingrese el mes de Nacimiento (JUNIO): ");
        String mes = scann.next();

        if ( ((dia >= 21 )  && (mes.equalsIgnoreCase("Marzo")))
                || ((dia <= 20) && (mes.equalsIgnoreCase("Abril"))) ) {
            System.out.println("Eres Aries ");
        } else if (((dia >= 21 )  && (mes.equalsIgnoreCase("Abril")))
                || ((dia <= 20) && (mes.equalsIgnoreCase("Mayo"))) ) {
            System.out.println("Eres Tauro ");
        } else if (((dia >= 21 )  && (mes.equalsIgnoreCase("Mayo")))
                || ((dia <= 21) && (mes.equalsIgnoreCase("Junio"))) ) {
            System.out.println("Eres Géminis ");
        }else if (((dia >= 22 )  && (mes.equalsIgnoreCase("Junio")))
                || ((dia <= 22) && (mes.equalsIgnoreCase("Julio"))) ) {
            System.out.println("Cáncer ");
        }else if (((dia >= 23 )  && (mes.equalsIgnoreCase("Julio")))
                || ((dia <= 23) && (mes.equalsIgnoreCase("Agosto"))) ) {
            System.out.println("Eres Leo ");
        }else if (((dia >= 24 )  && (mes.equalsIgnoreCase("Agosto")))
                || ((dia <= 22) && (mes.equalsIgnoreCase("Septiembre"))) ) {
            System.out.println("Eres Virgo ");
        }else if (((dia >= 23 )  && (mes.equalsIgnoreCase("Septiembre")))
                || ((dia <= 22) && (mes.equalsIgnoreCase("Octubre"))) ) {
            System.out.println("Eres Libra ");
        } else if (((dia >= 23 )  && (mes.equalsIgnoreCase("Octubre")))
                || ((dia <= 22) && (mes.equalsIgnoreCase("Noviembre"))) ) {
            System.out.println("Eres Escorpio ");
        }else if (((dia >= 23 )  && (mes.equalsIgnoreCase("Noviembre")))
                || ((dia <= 21) && (mes.equalsIgnoreCase("Diciembre"))) ) {
            System.out.println("Eres Sagitario ");
        }else if (((dia >= 22 )  && (mes.equalsIgnoreCase("Diciembre")))
                || ((dia <= 20) && (mes.equalsIgnoreCase("Enero"))) ) {
            System.out.println("Capricornio ");
        }else if (((dia >= 21 )  && (mes.equalsIgnoreCase("Enero")))
                || ((dia <= 19) && (mes.equalsIgnoreCase("Febrero"))) ) {
            System.out.println("Eres Acuario ");
        } else {
            System.out.println("Eres Piscis");
        }
    }
}
