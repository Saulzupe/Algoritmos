/*
    Programa: Ejercicio 38  La esencia de la lógica de programación
    Programador: Saúl Zúñiga Pérez.
    Descripción:
                 Leer tres números enteros y determina si el penúltimo dígito de los tres es igual.
    Fecha:      10/08/22
 */

package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingrese tres números enteros: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segúndo número: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3 = sc.nextInt();

        if ( (num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99) && (num3 >= 10 && num3 <= 99)){
            System.out.println("Todos los números son de dos dígitos: ");
            int numero1Digito1 = num1 / 10;
            int numero1Digito2 = num1 % 10;
            int numero2Digito1 = num2 / 10;
            int numero2Digito2 = num2 % 10;
            int numero3Digito1 = num3 / 10;
            int numero3Digito2 = num3 % 10;
            if ( numero1Digito1 == numero2Digito1  && numero1Digito1 == numero3Digito1) {
                System.out.println("El penúltimo dígito de los tres números es igual");
            } else {
                System.out.println("El penúltimo dígito de los tres números son diferentes");
            }

        } else if ((num1 >= 100 && num1 <= 999) && (num2 >= 100 && num2 <= 999) && (num3 >= 100 && num3 <= 999)) {
            System.out.println("Todos los números son de 3 dígitos: ");
            //int numero1Digito1 = num1 / 100;
            int aux1           = num1 % 100;
            int numero1Digito2 = aux1 / 10;
           // int numero1Digito3 = aux1 % 10;

//            int numero2Digito1 = num2 / 100;
            int aux2           = num2 % 100;
            int numero2Digito2 = aux2 / 10;
//            int numero2Digito3 = aux2 % 10;

//            int numero3Digito1 = num3 / 100;
            int aux3           = num3 % 100;
//            int numero3Digito3 = aux3 % 10;
            int numero3Digito2 = aux3 / 10;

            if ((numero1Digito2 == numero2Digito2) && (numero1Digito2 == numero3Digito2)) {
                System.out.println("El penúltimo dígito de los tres números son iguales ");
            } else {
                System.out.println("No son iguales los penúltimos dígitos");
            }

        } else if ((num1 >= 1000 && num1 <= 9999) && (num2 >= 1000 && num2 <= 9999) && (num3 >= 1000 && num3 <= 9999)) {
//            int numero1Digito1 = num1 / 1000;
            int aux1           = num1 % 1000;
//            int numero1Digito2 = aux1 / 100;
            int aux2           = aux1 % 100;
          int numero1Digito3 = aux2 / 10;
//            int numero1Digito4 = aux2 % 10;

//            int numero12Digito1 = num1 / 1000;
            int aux3           = num1 % 1000;
//            int numero2Digito2 = aux3 / 100;
            int aux4          = aux3 % 100;
            int numero2Digito3 = aux4 / 10;
//            int numero2Digito4 = aux4 % 10;

//            int numero3Digito1 = num1 / 1000;
            int aux5           = num1 % 1000;
//            int numero3Digito2 = aux5 / 100;
            int aux6           = aux5 % 100;
            int numero3Digito3 = aux6 / 10;
//            int numero3Digito4 = aux6 % 10;

            if ((numero1Digito3 == numero2Digito3) && (numero1Digito3 == numero3Digito3)) {
                System.out.println("El penúltimo dígito de los tres números son iguales ");
            } else {
                System.out.println("No son iguales los penúltimos dígitos");
            }
        } else {
            System.out.println("¡Ups... Algo salió mal! ");
        }
    }
}
