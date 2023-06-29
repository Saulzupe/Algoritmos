package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 20 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
// Fecha: Mayo - 2023
public class PiramideHuecaV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Piramide *****");
        System.out.print("Ingrese la altura de la piramide: ");
        int altura = sc.nextInt();
        System.out.print("Ingrese el caracter a pintar: ");
        char c = sc.next().charAt(0);

        for (int i = 1; i <= altura; i++){ // altura o filas
                for (int j = 1; j <= altura-i; j++){ // espacio entre filas
                    System.out.print(" ");
                }
                for (int k = 1; k <=i*2; k++){
                    if (i == altura || (k == 1 || k == 2*i -1)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}
