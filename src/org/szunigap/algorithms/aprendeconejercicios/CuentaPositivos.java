package org.szunigap.algorithms.aprendeconejercicios;

import java.util.Scanner;
/*
*  Bucle while que termina cuando se introduce por taclado un número negativo
*  Modificado por Saúl
* */
public class CuentaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciento números y pulsando INTRO. ");
        System.out.println("Para terminar, introduzca un número negativo. ");

        int numeroIntroducido = 0;
        int cuentaNumeros = 0;
        int suma = 0;

        while (numeroIntroducido >= 0) {
            numeroIntroducido = sc.nextInt();
            cuentaNumeros++;
            suma = suma + numeroIntroducido;
        }
        System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
        System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
    }
}
