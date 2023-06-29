package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 26
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que calcule el factorial de un número leído por teclado
    Fecha: Mayo - 23
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Digite un número: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 1; i--){
             factorial *= i;
        }
        System.out.println("El factorial de " + numero + "!  es = " + factorial);
    }
}
