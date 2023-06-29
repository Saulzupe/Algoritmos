/*
* Programa: Ejercicio 2.26 Múltiplos
* Programador: Saúl Zúñiga
* Descripción: Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo
*               e imprima el resultado.
* */
package org.szunigap.algorithms.deitel;

import javax.swing.*;

public class Ejercicio2_26 {
    public static void main(String[] args) {
        String numero, numero2;
        int num, num2;
        numero = JOptionPane.showInputDialog("Ingrese un número: ");
        numero2 = JOptionPane.showInputDialog("Ingrese otro número : ");

        num = Integer.parseInt(numero);
        num2 = Integer.parseInt(numero2);

        String multiplo = (num % num2 == 0) ? num + " es múltiplo de " + num2 : "no son multiplos";
        JOptionPane.showMessageDialog(null ,multiplo);
    }
}
