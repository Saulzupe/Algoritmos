package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 14 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que pida una base y un exponente (entero positivo) y que
//  |           calcule la potencia
// Fecha: Mayo - 2023
public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Calculando la potencia ***");
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        double potencia = 1.0d;
        //double potencia = Math.pow(base, exponente);
        for (int i = exponente; i != 0; i--){
             potencia *= base;
        }

        System.out.println(potencia);
    }
}
