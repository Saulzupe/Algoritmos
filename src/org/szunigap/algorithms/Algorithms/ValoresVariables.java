/* Programa: Ejercicio 1
*  Programador: Saul Zúñiga
*  Descripción: Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores
*  144 y 199 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la resta,
*  la división y la multuplicación.
*  Fecha: 06/05/22
*  Revisión: Ninguna
*/
package org.szunigap.algorithms.Algorithms;

public class ValoresVariables {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 144;
        num2 = 999;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int suma = num1 + num2;
        System.out.println("suma = " + suma);
        int resta = num1 - num2;
        System.out.println("resta = " + resta);
        int multiplicacion = num1 * num2;
        System.out.println("multiplicacion = " + multiplicacion);
        int division = num2 / num1;
        System.out.println("division = " + division);
    }
}
