/*
    Programa: Ejercicio 7 - Aprende a programas con ejercicios libro
    Descripción: Realiza el control de acceso  a una caja fuerte. LA combinación será un número
                 de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos,
                 se nos mostrará el mensaje "Lo siento, esa no es la combinación" y si acertamos
                 se nos dirá "La caja fuerte se ha abierto satisfactoriamente".
                 Tendremos cuatro oportunidades para abrir la caja fuerte
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion, contador;
        contador = 0;
        System.out.print("Ingrese la combinación: ");
        combinacion = sc.nextInt();
        while (contador < 4) {
            if (combinacion == 7180){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento esa no es la combinación ");
            }
            System.out.print("Ingrese de nuevo la combinación: ");
            combinacion = sc.nextInt();
            contador++;
        }
    }
}
