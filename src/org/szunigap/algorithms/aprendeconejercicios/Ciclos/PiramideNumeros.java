package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 24
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que lea un número n e imprima una piramide de números con n filas
                    c
    Fecha: Mayo - 23
 */
public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de filas (n): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
