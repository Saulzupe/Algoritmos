/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Mostrar en pantalla el promedio entero de los n primeros múltiplos de 3 para un número n leído.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, promedio = 0;
        System.out.print("Promedio de la suma de N múltiplos de 3. Ingrese un límite \t");
        int n = sc.nextInt();
        int contador = 0;
        int m = 0;
        while (contador < n){
            m += 3;
            suma += m;
            contador++;

        }
        promedio = suma/contador;
        System.out.print("El promedio de los primeros n múltiplos de 3 es : " + promedio);
    }
}
