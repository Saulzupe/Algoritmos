/* Programa: Ejercicio 1 y 4
 *  Programador: Saul Zúñiga
 *  Descripción: Realiza un programa que pida dos números y que luego muestre el resultado
 * Escribe un programa que sume, reste, multiplique y divida dos números
    introducidos por teclado.
de su multiplicación.
 *  Fecha: 11/05/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        int num1, num2 = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = num.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = num.nextInt();

        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
        int multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        int division = num1 / num2;
        System.out.println("El resultado de la divison es: " + division);
    }
}
