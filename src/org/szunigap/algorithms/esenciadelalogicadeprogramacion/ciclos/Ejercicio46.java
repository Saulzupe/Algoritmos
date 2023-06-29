/*
        Programa: Ejercicio 45 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Leer un número y calcularle el promedio entero de los factoriales de los enteros
                       comprendidos entre 1 y el número leído.
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial, promedio, suma=0, contador =0;

        System.out.print("Digite un número : ");
        int numero = entrada.nextInt();

        promedio = 0;
        if (numero > 0) {
            for (int i = 1; i <= numero; i++){
                factorial = 1;
                for (int aux = 1; aux <= i; aux++){
                    factorial *= aux;
                }
                suma += factorial;
                contador++;
            }
            promedio = suma/contador;
        }
        System.out.println("El promedio entero entre 1 y " + numero + " es " + promedio);
    }
}
