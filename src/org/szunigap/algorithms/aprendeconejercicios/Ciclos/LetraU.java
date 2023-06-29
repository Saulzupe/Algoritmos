package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 30
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que pinte al letra U por pantalla hecha con asteriscos. El
                programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
                dos asteriscos menos en la base para simular la curvatura de las esquinas
                inferiores.
    Fecha: Junio - 23
 */
public class LetraU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la U: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            System.out.println("*" + "\t\t\t" + "*");
            if (i == 4) {
                System.out.print("\t");
            }
        }
        for (int i= 0; i <= altura/2; i++) {
            System.out.print("* ");
        }
    }
}
