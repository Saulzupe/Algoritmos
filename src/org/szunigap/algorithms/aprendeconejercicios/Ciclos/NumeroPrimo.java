package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 16 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que diga si un número introducido por teclado es o no primo.
//              Un número primo es aquel que sólo es divisible entre el mismo y la unidad
// sumando los dos anteriores
// Fecha: Mayo - 2023
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo = false;

        System.out.print(" Ingrese un número: ");
        int numero = sc.nextInt();
        if (numero == 1 || numero == 0) {
            System.out.println(" no es primo ");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    System.out.println(numero + "\t no es primo");
                    break;
                } else {
                    primo = true;

                }
            }
            if (primo) {
                System.out.println(numero + "\t es primo");
            }
        }
    }
}
