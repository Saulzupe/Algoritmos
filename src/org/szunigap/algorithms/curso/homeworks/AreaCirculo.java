package org.szunigap.algorithms.curso.homeworks;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);

        System.out.println("El radio del circulo es: " + area);
    }
}
