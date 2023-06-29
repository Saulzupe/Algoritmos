// Programa: Logica de programación
// Programador: Saúl Zúñiga
// Descripción: * Leer tres números enteros y determinar cuál es el mayor. Usar solamente dos var

package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero:  ");
        int numero1 = sc.nextInt();;
        System.out.print("Ingrese otro número: ");
        int numero2 = sc.nextInt();
        System.out.println();

           // Leer tres números enteros y determinar cuál es el mayor. Usar solamente dos variables.
            if (numero1 > numero2) {
                System.out.println("Ingrese otro número: ");
                numero2 = sc.nextInt();
                if (numero1 > numero2) {
                    System.out.println(numero1 + " " + numero2);
                } else {
                    System.out.println(numero2 + " " + numero1);
                }
            } else {
                System.out.println("Ingrese el tercer número");
                numero1 = sc.nextInt();
                sc.close();

                if ( numero2 > numero1){
                    System.out.println(numero2 + " " + numero1 );
                } else {
                    System.out.println(numero1 + " " + numero2);
                }
            }
    }
}
