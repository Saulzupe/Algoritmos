/*
        Programa: Ejercicio 367 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Leer un número entero y mostrar en pantalla su tabla de multiplicar
        Fecha:      10/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un número entero: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = "+ i*numero);
        }
    }
}
