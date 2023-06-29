package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 30
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que pinte la letra Ciclos.L por pantalla hecha con asteriscos.
                El programa pedirá la altura. El palo horizontal de la Ciclos.L tendrá una longitud
                de la mitad (división entera entre 2) de la altura más uno.
    Fecha: Junio - 23
 */
public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la Ciclos.L: ");
        int altura = sc.nextInt();

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < altura/2; i++){
            System.out.print("*");
        }
    }
}
