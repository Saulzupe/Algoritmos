package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 14 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que lea una lista de diez número y determine cuántos son
//              positivos, y cuántos negativos
// Fecha: Mayo - 2023
public class ListaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int lista = 1;

        System.out.println("***** Ingrese 10 números positivos y negativos *****");
        while (lista <= 10) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
            lista++;
        }
        System.out.println("La lista tiene " + contadorPositivos + " positivos " +
                " y " + contadorNegativos + " negativos");
    }
}
