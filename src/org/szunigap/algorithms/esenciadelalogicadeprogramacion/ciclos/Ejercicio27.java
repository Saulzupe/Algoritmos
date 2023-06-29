/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Leer 2 números enteros y determinar cuál de los dos tiene mayor cantidad de dígitos
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, digitoNumero1, digitoNumero2,
                contadorNum1 = 0, contadorNum2 = 0;
        boolean primo = false;

        System.out.print("Digite el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Digite el segundo número: ");
        num2 = sc.nextInt();

        if (num1 < 0 && num2 < 0) {
            num1 = -num1;
            num2 = -num2;
        }
        // Creando un ciclo while para extraer los dígitos
        while (num1 != 0){
            digitoNumero1 = num1 - num1 / 10 * 10;
            contadorNum1++;
            num1 = num1 / 10;
        }
        while (num2 != 0){
            digitoNumero2 = num2 - num2 / 10 * 10;
            contadorNum2++;
            num2 = num2 / 10;
        }

        if (contadorNum1 > contadorNum2) {
            System.out.println("El primer numero ingresado tiene mas dígitos");
        } else if (contadorNum2 > contadorNum1) {
            System.out.println("El Segundo número ingresado tiene más dígitos");
        } else if (contadorNum1 == contadorNum2) {
            System.out.println("La cantidad de dígitos son iguales");
        }
    }
}
