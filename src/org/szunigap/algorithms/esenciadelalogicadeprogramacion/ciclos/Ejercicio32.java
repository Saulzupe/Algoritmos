/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: * Leer números hasta que digiten 0 y determinar a cuanto es igual el promedio entero
                     de los números primos leídos.
        Fecha:     04/09/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPrimo = 0, contadorPrimo =  0;
        double  promedioPrimo = 0 ;
        System.out.print("Digite un número: ");
        int numero = sc.nextInt();
        boolean primo = false;
        int m = numero/2;
        while (numero != 0) {
            System.out.print("Digite un numero: ");
            numero = sc.nextInt();
            for (int i = 2; i <= m; i++){
                if (numero%i==0){
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }
            if (primo) {sumaPrimo += numero; contadorPrimo++;}
        }
        promedioPrimo = sumaPrimo  / contadorPrimo;
        System.out.print("EL promedio de los números primos leídos es " + promedioPrimo);
    }
}
