package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseImponible, iva, total, ivaAplicado, precioIva;
        precioIva = 0.0;
        iva = 0.0;
        ivaAplicado = 0.0;
        total = 0.0;
        System.out.println("Introduzca la base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.println("Introduzca el tipo de Iva (general, reducido, superreducido): ");
        String tipoIva = sc.next();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promocional = sc.next();

        switch (tipoIva) {
            case "general":
                iva = 0.21;
                ivaAplicado = 0.21 * baseImponible;
                precioIva = ivaAplicado + baseImponible;

                break;
            case "reducido":
                iva = 0.10;
                ivaAplicado = 0.10 * baseImponible;
                precioIva = ivaAplicado + baseImponible;
                break;
            case "superreducido":
                iva = 0.04;
                ivaAplicado = 0.04 * baseImponible;
                precioIva = ivaAplicado + baseImponible;
            default:
                System.out.println("ingrese un tipo de iva");
        }
        switch (promocional) {
            case "nopromo":
                total =  precioIva;
                break;
            case "mitad":
                total =    precioIva * 0.5;
                break;
            case "meno5":
                total =   precioIva - 5;
                break;
            case "5porc":
                total =   precioIva * 0.05;
            default:
                System.out.println("Ingrese un codigo promocional ");
        }
        System.out.println("Base imponible = " + baseImponible);
        System.out.println("Iva (" + iva +") : " +ivaAplicado);
        System.out.println("Precio con IVA " + precioIva);
        System.out.println("Cód. promo. (" + promocional + ") " + (-1)* total);
        System.out.println("TOTAL: " + total);



    }
}
