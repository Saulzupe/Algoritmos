/*
*  Programa: Ejercicio 11 Condicionales (Aprende Java con Ejercicios)
*  Programador: Saúl Zúñiga
*  Descripción: Escribe un programa que dada una hora determinada (horas y minutos), Calcule los segundos que faltan
*               para llegar a la media noche.
* Fecha:        09/07/22
* Revisión: Ninguna.
* */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class MediaNoche {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mediaNoche = 86400;

        System.out.println("Ingrese las horas formato (00): ");
        int hora = scan.nextInt();
        System.out.println("Ingrese los minutos formato (00): ");
        int minuto = scan.nextInt();

        int segundosTranscurridos = (hora * 3600) + (minuto * 60);
        int segundosMediaNoche  = (mediaNoche - segundosTranscurridos);

        System.out.println(" Faltan " + segundosMediaNoche + "s para la media noche");

    }
}
