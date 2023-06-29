package org.szunigap.algorithms.curso.homeworks;

import java.util.Scanner;

public class MayoraMenor {
    public static void main(String[] args) {
        int num1, num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = sc.nextInt();

        String mayor = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
     /*   int mayor = (num1 > num2) ? num1: num2;
        int menor = (num1 < num2) ? num1: num2;*/
        System.out.println(mayor);
    }
}
