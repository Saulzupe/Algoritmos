package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 26
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que pida un número, un digito. El programa nos debe da la
    posicion o (pocisiones) contando de izquierda a derecha que ocupa ese digito en el número introducido

    Fecha: Mayo - 23
 */
public class Posicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, reverso = 0, aux = 0, dig;
        boolean encontrado = false;

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese un digito: ");
        int digito = sc.nextInt();
        aux = numero;
// Colocamos el número al revés para leerlo de izquierda a derecha
        while (aux!=0) {
            reverso = (reverso * 10) + (aux % 10);
            aux /= 10;
        }
// Extraemos los digitos y vamos comparando de izquierda a derecha
        for (int i = 1; i <= digito; i++){
            dig = reverso % 10;
            if (digito == dig) {
                encontrado = true;
                System.out.println("En la posición " + i);
            }
            reverso/=10;
        }
        if (encontrado == false) {
            System.out.println("No esta en ninguna posición");
        }

    }
}
