/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción: leer dos numeros enteros y determinar cual es el mayor
Revisión:    Ninguna
Fecha 22/07/22
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;
        System.out.print("Ingrese un número entero de dos dígitos: ");
        num = sc.nextInt();
        System.out.print("Ingrese otro número de dos digitos: ");
        num2 = sc.nextInt();

        if ((num >= 10 && num2 >= 10) && (num < 100 && num2 < 100)){
            String comparar = num > num2 ? num + " ya que > " + num2 : num2 + " ya que > " + num;
            System.out.println("El mayor es " + comparar);
        } else {
            System.out.println("Alguno de los dos numeros ingresados no es de dos digitos...");
        }
    }
}
