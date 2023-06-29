/*
 * PROGRAMA: Ejercicio 9 Aprende Java con ejercicios
 * PROGRAMADOR: SAÚL ZÚÑIGA PÉREZ
 * DESCRIPCIÓN: Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
 *              A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado
 *              de introducir los datos cuando meta un número negativo
 * FECHA: 16/12/22
 * REVISION: NINGUNA
 * */

package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class MediaDeUnConjunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        float promedio = 0;
        System.out.print("Ingrese números positivos: ");
        int numero = sc.nextInt();
        while (numero >= 0){
            System.out.print("Ingrese otro número: ");
             numero = sc.nextInt();
             if (numero > 0){
                 suma = numero + suma;
                 contador++;
             }
        }
        promedio = (float) suma/contador;
        System.out.print("El promedio del conjunto de números es: " + promedio);
    }
}
