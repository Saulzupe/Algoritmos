/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Lees 2 números enteros y determinar cual de los dos tiene mayor cantidad de dígitos primos.
        Fecha:     27/08/22
        Revisión : Ninguna
        */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, digitoNumero1, digitoNumero2,
              contadorPrimoNumero1 = 0, contadorPrimoNumero2 = 0;
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

            if (digitoNumero1 < 2 ||digitoNumero1 % 2 == 0){ // Si el digito es menor o es divisible entre dos no es primo
                primo = false;
            }else{
                primo = true;
                contadorPrimoNumero1++;
            }
            num1 = num1 / 10;
        }
        while (num2 != 0){
            digitoNumero2 = num2 - num2 / 10 * 10;
            if (digitoNumero2 < 2 ||digitoNumero2 % 2 == 0){
                primo = false;
            } else {
                primo = true;
                contadorPrimoNumero2++;
            }
            num2 = num2 / 10;
        }
        if (primo){
            if (contadorPrimoNumero1 > contadorPrimoNumero2) {
                System.out.println("El primer numero ingresado tiene mas dígitos primos");
            } else if (contadorPrimoNumero2 > contadorPrimoNumero1) {
                System.out.println("El Segundo número ingresado tiene más dígitos primos");
            } else if (contadorPrimoNumero1 == contadorPrimoNumero2) {
                System.out.println("La cantidad de dígitos primos son iguales");
            }
        } else {
            System.out.println("No hay dígitos primos ");
        }
    }
}
