package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class FacturaBaseImponibleV2 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        float precio1, precio2, baseImponible;
        float iva = 1.21f;

        System.out.println("Ingrese el nombre  del producto: \n");
        String prod = pr.nextLine();
        System.out.println("Ingrese el nombre  del segundo producto: \n");
        String prod2 = pr.nextLine();

        System.out.println("Ingrese el precio del producto: \n ");
        precio1 = pr.nextInt();
        System.out.println("Ingrese el precio del segundo producto: \n ");
        precio2 = pr.nextInt();

        baseImponible = precio1 + precio2;

        double total = (double)baseImponible/iva;

        System.out.println("La factura con los productos: " + prod + "  " + prod2 +
                "\n tiene un total con una base imponible con iva de " + total);
    }
}
