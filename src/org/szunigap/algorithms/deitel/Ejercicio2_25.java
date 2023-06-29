/*
* Programa: Ejercicio 2.25 (PAR O IMPAR)
* Programador: Saúl Zúñiga
* Descripción: Escriba una aplicación que lea un entero y que determine e imprima si es impar o par
*               (Use el operador residuo). Un número pas es un múltiplo de 2. Cualquier múltiplo de 2 deja
*               un residuo de 0 cuando se divide entre 2
* */
package org.szunigap.algorithms.deitel;

import javax.swing.*;

public class Ejercicio2_25 {
    public static void main(String[] args) {

        String numero =  JOptionPane.showInputDialog("Ingrese un número: ");
        int num = Integer.parseInt(numero);

        String parImpar = (num % 2 == 0) ? num + "Es par" : num + " es impar";

        JOptionPane.showMessageDialog(null, parImpar);
    }
}
