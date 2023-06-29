/* Programa: Ejercicio 22 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
 *  Fecha: 10/07/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class CuantoFaltaFinSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana: (Lunes - Viernes): ");
        String dia = scanner.next();

        int numeroDia = 0;
        switch (dia) {
            case "Lunes":
                numeroDia = 0;
                break;
            case "Martes":
                numeroDia = 1;
                break;
            case "Miercoles":
                numeroDia = 2;
                break;
            case "Jueves":
                numeroDia = 3;
                break;
            case "Viernes":
                numeroDia = 4;
                break;
            default:
                System.out.println("Día invalido");
        }

        System.out.println("Introduzca la hora y minutos: ");
        System.out.println("Hora: ");
        int hora = scanner.nextInt();
        System.out.println("Minutos: ");
        int minutos = scanner.nextInt();

        int minutosTotales = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (numeroDia * 24 * 60) + (hora * 60) + minutos;

        System.out.println(" Faltan: " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana");
    }
}
