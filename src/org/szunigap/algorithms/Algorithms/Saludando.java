package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class Saludando {
    public static void main(String[] args) {
        Scanner hora = new Scanner(System.in);
        System.out.println(" Ingrese una hora (0 - 24) ");
        int hra = hora.nextInt();

        if (hra >= 6 && hra <= 12) {
            System.out.println("Buenos días ");
        } else if ( hra >= 13 && hra <= 20 ) {
            System.out.println("Buenas tardes");
        } else if ( hra > 21 || hra < 5) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Ingreso una hora invalida");
        }

    }
}
