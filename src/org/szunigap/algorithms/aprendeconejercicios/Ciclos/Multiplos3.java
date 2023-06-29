package Ciclos;

import java.util.Scanner;
/*
    Programa: Ejercicio 27
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y
    un número leído por teclado
    Fecha: Mayo - 23
 */
public class Multiplos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1, suma = 0;
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero; i+=3) {
            suma += i;
            contador++;
            System.out.print(i + " ,");
        }
        System.out.println("La suma de los múltiplos de 3 es = " + suma);
        System.out.println("El conteo total de los multiplos es = " + contador);
    }
}
