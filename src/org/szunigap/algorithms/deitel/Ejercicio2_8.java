/*
* Programa: Ejercicio 2.8 libro deitel
* Programador: Saúl Zúñiga
* Descripción: Escriba instrucciones en Java que realicen cada una de las siguientes tareas;
*   a) Mostrar el mensaje "Escriba un entero: ", dejando el cursos en la misma línea.
*   b) Asignar el producto de las variables b y c a la variable a.
*   C) Usar un comando para indicar que un programa va a realizar un cálculo de nómina de muestra.*/
package org.szunigap.algorithms.deitel;

import javax.swing.*;

public class Ejercicio2_8 {
    public static void main(String[] args) {
        String numero, numero2;
        int a, b, c;
        JOptionPane.showMessageDialog(null,"Cálculo de nómina de muestra");

        numero = JOptionPane.showInputDialog("Escriba un entero: ");
        numero2 = JOptionPane.showInputDialog("Escribe otro entero ");

        b = Integer.parseInt(numero);
        c = Integer.parseInt(numero2);

        a = c * b;
        JOptionPane.showMessageDialog(null,
                "El producto de b * c es: " + a, "Resultado" ,JOptionPane.PLAIN_MESSAGE);

    }
}
