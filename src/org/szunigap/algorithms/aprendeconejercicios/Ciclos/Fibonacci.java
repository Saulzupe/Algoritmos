package Ciclos;

import java.util.Scanner;
// Programa: Ejercicio 14 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que muestre los n primeros terminos de la serie de Ciclos.Fibonacci.
//      El primer término de la serie fibonacci es 0 el segundo termino es 1 y el resto se calcula
// sumando los dos anteriores
// Fecha: Mayo - 2023
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerTermino = 0;
        int segundoTermino = 1;
        int fibonacci = 0;
        System.out.println("********* Serie Ciclos.Fibonacci **********");
        System.out.print("Ingrese n (primeros términos) : ");
        int ingresado = sc.nextInt();


        System.out.print(primerTermino + ", \t" + segundoTermino );
        for (int i = 0; i <= ingresado; i++) {
            fibonacci = primerTermino + segundoTermino;
            primerTermino = segundoTermino;
            segundoTermino = fibonacci;

            System.out.print( ", " + fibonacci);
        }
    }
}
