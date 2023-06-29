/*
 * Programa: Sistema estanque de gasolina.
 * Programador: Saúl Zúñiga Pérez
 * Descripción: Obtener el nombre mas largo de tres personas, según los siguientes requerimientos.
 *  - Mediante el teclado pedir el nombre completo ( nombre + apellido ) de tres personas usando JOptionPane y método
 * showinputdialog();
 * - Calcular e imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir
 * solo uno de los tres, el  de más caracteres en el nombre.
 * - Usar (.split(""); del objeto String para separar nombre y apellido en un arreglo y con el indice cero accedemos al
 * nombre de la persona
 * - No usar loops
 * Fecha de creación: 04/05/21
 * Revisión: ninguna.
 */
package org.szunigap.algorithms.curso.homeworks;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo: ");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo: ");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo: ");

        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max : nombre3;

        System.out.println("La persona con el nombre más largo es " + max);
    }
}
