/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Promediar los x primeros múltiplos de 2 y determinar si ese promedio es mayor que los primeros
                        múltiplos de 5 para valores x y x leídos.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, promedioX = 0,promedioY = 0, sumay = 0;
        System.out.println("Promediando x Y y múltiplos de 2 y de 5");
        System.out.print("Dígite un entero (n) múltiplos de 2 : ");
        int x = sc.nextInt();
        System.out.print("Dígite un entero (n) múltiplos de 5 : ");
        int y = sc.nextInt();
        int i = 0,j = 0 , mx = 0, my= 0;
     /*   while (i < x) {
            mx += 2;
            suma += mx;
           // System.out.println(mx);
            i++;
        }
        //System.out.println("suma = " + suma);
        promedioX = suma/i;*/

        for (i=0; i <= x; i++){
            mx +=2;
           // System.out.println(mx);
            suma += mx;
        }
        promedioX = suma/i;
        while (j < y) {
            my += 5;

            sumay += my;
           // System.out.println(my);
            j++;
        }
        // System.out.println("sumay = " + sumay);
        promedioY = sumay/j;
        System.out.println("promedio de multiplos de 2 = " + promedioX);
        System.out.println("promedio de múltiplos de 5 = " + promedioY);

        if (promedioX > promedioY) {
            System.out.println("El promedio de los múltiplos de 2 es mayor al promedio de los múltiplos de 5 -> \t" + promedioX);
        } else {
            System.out.println("El promedio de los múltiplos de 5 es mayor al promedio de los múltiplos de 2 -> \t" + promedioY);
        }
    }
}
