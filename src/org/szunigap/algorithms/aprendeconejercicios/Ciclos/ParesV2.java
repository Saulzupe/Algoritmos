package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 30
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los
                dígitos pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
                Usa long en lugar de int donde sea necesario para admitir números largos
    Fecha: Junio - 23
 */
public class ParesV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long reverso = 0;
        int longitud = 0, sumaPar=0, digito;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();


        while (numero!=0) {
            reverso = (reverso * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        for (int i = 0; i <= longitud; i++){
            digito = (int) reverso % 10;

            if (digito % 2 == 0) {
                sumaPar += digito;
                System.out.print( digito + "\t");

            }
            reverso /= 10;
        }
        System.out.println();
        System.out.println("Suma de los dígitos pares: " + sumaPar);
    }
}
