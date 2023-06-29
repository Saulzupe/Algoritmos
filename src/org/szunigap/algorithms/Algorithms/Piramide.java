/*
 *  Programa: Ejercicio 15 Condicionales (Aprende Java con Ejercicios)
 *  Programador: Saúl Zúñiga
 *  Descripción: Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +,
-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
izquierda o hacia la derecha.
 * Fecha:        10/07/22
 * Revisión: Ninguna.
 * */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Introduzca un carácter: ");
        String c = opc.next();

        System.out.println("Eligar la dirección del vértice de la piramide \n 1.- arriba" +
                "\n 2.- Derecha \n 3.- Abajo \n 4.-Izquierda");
        int op = opc.nextInt();
        opc.close();
        switch (op){
            case 1:
                System.out.println("      " + c);
                System.out.println("   " + c +c +c);
                System.out.println(" " + c + c +c + c);
                break;
            case 2:
                System.out.println(" " + c);
                System.out.println(" " + c +c +c);
                System.out.println(" " + c + c +c + c);
                System.out.println(" " + c +c +c);
                System.out.println(" " + c);

                break;
            case 3:
                System.out.println(" " + c + c +c + c + c + c + c);
                System.out.println("   " + c +c +c + c + c);
                System.out.println("      " + c);
                break;
            case 4:
                System.out.println("         " + c);
                System.out.println("   " + c +c +c);
                System.out.println(""+ c+ c + c +c);
                System.out.println("   " + c +c +c);
                System.out.println("         " + c);

                break;
        }

    }
}
