package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class CalendarioGimnasio {
    public static void main(String[] args) {
        Scanner dia = new Scanner(System.in);

        System.out.println("Ingresa un día de la semana (L - V): ");
        String d = dia.nextLine();

        switch (d) {
            case  "L":
                System.out.println("Hoy lunes se entrena hombro  " + d);
                break;
            case "M":
                System.out.println("Hoy Martes se entrena Pierna " + d);
                break;
            case "ML":
                System.out.println("Hoy Miercoles entrena Pecho " + d);
                break;
            case "J":
                System.out.println("Hoy Jueves se entrena Bicep " + d);
                break;
            case "V":
                System.out.println("Hoy Viernes se entrena Tricep " + d);
                break;
            case "S":
                System.out.println("Hoy Sábado se entrena Espalda " + d);
                break;
            default:
                System.out.println(" No es un día valido o es domingo de descanso");
        }
    }
}
