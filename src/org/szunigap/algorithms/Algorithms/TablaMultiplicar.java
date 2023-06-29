/*
* PROGRAMA: Ejercicio 8 Aprende Java con ejercicios
* PROGRAMADOR: SAÚL ZÚÑIGA PÉREZ
* DESCRIPCIÓN: Muestra la tabla de múltiplicar de un número introducido por teclado
* FECHA: 16/12/22
* REVISION: NINGUNA
* */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número te mostrare su tabla: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (i*numero));
        }
    }
}
