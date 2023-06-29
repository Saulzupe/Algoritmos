/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer números hasta que digiten 0 y determinar a cuánto es igual el promedio de
                        los números terminados en 5.
                     * Leer números hasta que digiten 0 y determinar a cuanto es igual el promedio entero
                     de los números primos leídos.
        Fecha:     04/09/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito = 0, contador=0, suma = 0;
        double promedio = 0 ;
        System.out.print("Digite un número: ");
        int numero = sc.nextInt();
        while (numero != 0) {
            System.out.print("Digite un numero: ");
            numero = sc.nextInt();
            if ( numero % 10 == 5) {
                suma += numero;
                contador++;
            }
        }
        promedio = suma / contador;
        System.out.println(suma);
        System.out.println("El promedio de los números terminados en 5 es " + promedio);


    }
}
