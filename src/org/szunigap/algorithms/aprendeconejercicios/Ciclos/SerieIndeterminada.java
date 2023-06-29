package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 23
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que permita ir introduciendo una serie indeterminada de números
                mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar
                el total acumulado, el contador de los números introducidos y la media
    Fecha: Mayo - 23
 */
public class SerieIndeterminada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0;
        do {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
            suma += numero;
            contador++;
        }while (suma <= 10000);
        double media = (double) suma / contador;
        System.out.println(" Total acumulado: " + suma);
        System.out.println(" Números introducidos: " + contador);
        System.out.println(" Media " + media);
    }
}
