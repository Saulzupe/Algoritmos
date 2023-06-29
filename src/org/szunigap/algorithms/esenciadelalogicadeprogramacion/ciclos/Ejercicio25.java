/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: Leer un número entero y determinar a cuánto es igual el promedio entero de sus dígitos.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito, suma = 0, promedio = 0;
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();
        //contando dígitos
        int contador = 0;
        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            contador++; //Contando los dígitos
            suma  += digito; // Sumando los dígitos
            promedio = suma/contador;
            numero = numero / 10;
        }
        System.out.println("El promedio de la suma de los digitos es " + promedio);
    }
}
