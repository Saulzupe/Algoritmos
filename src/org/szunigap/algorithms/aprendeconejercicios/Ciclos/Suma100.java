package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 17 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Realiza un programa que sume los 100 números siguientes a un número entero y positivo
//              introducido por teclado.  Se debe comprobar que el dato introducido es correcto
//              (que es un número pisitivo)
// Fecha: Mayo - 2023
public class Suma100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        System.out.print("Ingrese un número entero y positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("No es positivo");
        }
        int tope = numero + 100;

        for (int i = numero; i <= tope; i++){
             suma = tope * ((numero + tope)/2); // fórmula de una serie aritmetica gauss.
        }
        System.out.println("La suma los números del " + numero + " al " + tope + " es = " + suma);
    }
}
