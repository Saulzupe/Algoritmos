/* Programa: Ejercicio 6
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa que calcule el total de una factura a partir de la base
    imponible (precio sin IVA). La base imponible estará almacenada en una
    variable.
 *  Fecha: 11/05/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class FacturaBaseImponible {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        int precio1, precio2, baseImponible;

        System.out.println("Ingrese el nombre  del producto: \n");
        String prod = pr.nextLine();
        System.out.println("Ingrese el nombre  del segundo producto: \n");
        String prod2 = pr.nextLine();

        System.out.println("Ingrese el precio del producto: \n ");
        precio1 = pr.nextInt();
        System.out.println("Ingrese el precio del segundo producto: \n ");
        precio2 = pr.nextInt();

        baseImponible = precio1 + precio2;

        System.out.println("La factura con los productos: " + prod + prod2 +
                " tiene un total con una base imponible sin iva de " + baseImponible);
    }
}
