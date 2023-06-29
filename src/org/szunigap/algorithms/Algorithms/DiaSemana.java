/* Programa: Ejercicio 3 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana
 *  Fecha: 14/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sábado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("No es un día Valido");
        }
    }
}
