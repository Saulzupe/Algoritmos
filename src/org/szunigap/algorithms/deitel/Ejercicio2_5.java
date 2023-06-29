package org.szunigap.algorithms.deitel;
/*
Programa: Ejercicio 2.5 libro Deitel
Programador: Saúl Zúñiga
Descripción: Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes tareas:
        a) Indicar que un programa calculará el producto de tres enteros.
        b) Crear un objeto Scanner llamado entrada que lea valores de la entrada estándar.
        c) Declarar las variables x, y, z y resultado de tipo int.
        d) Pedir al usuario que escriba el primer entero.
        e) Leer el primer entero del usuario y almacenarlo en la variable x.
        f ) Pedir al usuario que escriba el segundo entero.
        g) Leer el segundo entero del usuario y almacenarlo en la variable y.
        h) Pedir al usuario que escriba el tercer entero.
        i) Leer el tercer entero del usuario y almacenarlo en la variable z.
        j) Calcular el producto de los tres enteros contenidos en las variables x, y y z, y asignar el resultado a la variable
        resultado.
        k) Usar System.out.printf para mostrar el mensaje “El producto es”, seguido del valor de la variable resultado.
 */

import java.util.Arrays;
import java.util.Scanner;

// Este programa calculara el prodcuto de tres enteros
public class Ejercicio2_5 {
    public static void main(String[] args) {
        System.out.println("Calcular el producto de tres enteros");
        Scanner entrada = new Scanner(System.in);
        int x,y,z,resultado;
        System.out.print("Escribe el primer entero: ");
        x = entrada.nextInt();
        System.out.print("Escribe el segundo entero: ");
        y = entrada.nextInt();
        System.out.print("Escribe el tercer entero: ");
        z = entrada.nextInt();

        resultado = x * y * z;

        System.out.printf("%s %d","El producto es ",resultado);
    }
}
