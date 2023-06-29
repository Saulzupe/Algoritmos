/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción: Leer un número entero y determinar cuántos dígitos tiene
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        System.out.print("Dígite un número: ");
        int numero = sc.nextInt();

        //contando dígitos
        int contador = 0;
        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            contador++; //Contando los dígitos
            numero = numero / 10;
        }

        System.out.println("Tiene " + contador + " digitos");
    }

}
