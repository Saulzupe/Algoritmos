package Ciclos;

import java.util.Scanner;

// Programa: Ejercicio 18 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Escribe un programa que pinte una prámide por pantalla. La altura se debe pedir por
//              teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado
// Fecha: Mayo - 2023
public class PiramideV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Piramide *****");
        System.out.print("Ingrese la altura de la piramide: ");
        int altura = sc.nextInt();
        System.out.print("Ingrese el caracter a pintar: ");
        char c = sc.next().charAt(0);

        for (int i = 1; i <= altura; i++){
                for (int j = 1; j <= altura-i; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <=(i*2)-1; k++){
                    System.out.print(c);
                }
            System.out.println();
        }
    }
}
