package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción: Leer un número entero de dos dígitos y determinar si ambos dígitos son pares
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de dos digitos");
        int num = sc.nextInt();
        // Determinamos si los digitos son pares
        int digito1 = num/10;
        int digito2 = num % 10;
        if((digito1%2==0) && (digito2%2==0)){
            System.out.println("Son pares los digitos del número entero ->: " + num);
        } else {
            System.out.println("No son pares: ");
        }
    }
}
