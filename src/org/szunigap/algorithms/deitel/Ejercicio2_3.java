package org.szunigap.algorithms.deitel;

import java.util.Scanner;

/**
 * Programa: Ejercicio 2.3 Programacion en Java - Deitel
 * Programador: Saúl Zúñiga Pérez
 * Descripción: Escriba instrucciones para realizar cada una de las siguientes tareas:
 *              - Declarar las variables c, estaEsUnaVariable, q76354, numero como de tipo int
 *              - Pedir al usuario que introduzca un entero.
 *              - Recibir un entero como entrada y asignar el resultado a la variable int valor.
 *                  Suponga que se puede utilizar la variable entrada tipo Scanner para recibir
 *                  un valor del teclado
 *               - Imprimir "Este es un programa en Java" en una línea de la ventana de comandos.
 *                  Use el método System.out.println-
 *               - Imprimir "Este es un programa en Java" en dos líneas de la ventana de comandos.
 *                 La primera línea debe terminar con "es un". Use el método System.out.printf y
 *                  dos especificadores de formato %s.
 *                - Si la variable numero no es igual a 7, mostrar "La variable numero no es
 *                  igual a 7"
 *              */
public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c, estaEsUnaVariable, q76354, numero;

        System.out.print("Introduzca un entero: ");
        int valor = entrada.nextInt();

        System.out.println("Esto es un programa en JAVA");

        System.out.printf("%s%n%s","Esto es un","programa en JAVA");

        numero = 3;
        if (numero != 7) {
            System.out.println("La variable número no es igual  a 7");
        }


    }
}
