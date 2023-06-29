/*
 * PROGRAMA: Ejercicio 9 Aprende Java con ejercicios
 * PROGRAMADOR: SAÚL ZÚÑIGA PÉREZ
 * DESCRIPCIÓN: Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
 * FECHA: 16/12/22
 * REVISION: NINGUNA
 * */

package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class ContandoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        while (numero != 0){
            int digito = numero - numero / 10 * 10;
            contador++;
            numero = numero / 10;
        }
        System.out.println("El numero " + numero + " ingresado tiene " + contador + " digitos");
    }
}
