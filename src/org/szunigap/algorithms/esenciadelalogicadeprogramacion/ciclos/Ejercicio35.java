/*
        Programa: Ejercicio 35 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Leer dos números y determinar a cuánto es igual el producto mutuo del primer
                        dígito de cada uno.
        Fecha:      10/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito = 0, digitoNumero2 = 0;
        System.out.print("Ingrese el primer número: ");
        int numero = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        while (numero != 0) {
            digito = numero - numero / 10 * 10;
            numero = numero / 10;
        }
        while (numero2 != 0) {
            digitoNumero2 = numero2 - numero2 / 10 * 10;
            numero2 = numero2 / 10;
        }

        int productoMutuo = digito * digitoNumero2;
        System.out.println("productoMutuo = " + productoMutuo);
    }
}
