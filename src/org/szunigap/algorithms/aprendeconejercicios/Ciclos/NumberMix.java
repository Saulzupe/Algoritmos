package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 25
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que pida dos números por teclado y que luego mezcle en
                dos números diferentes los dígitos pares y los impares. Se van comprobando los dígitos
                de la siguiente manera: primer dígito del primer número, primer digito del segundo
                número, segundo dígito del primer número, segundo digito del segundo número,
                tercer dígito del primer número... Para facilitar el ejercicio, podemos suponer que
                el usuario introducirá dos números de la misma longitud y que siempre habrá al menos
                un dígito par y uno impar. Usa long en lugar de int donde sea necesario para
                admitir números largos.
    Fecha: Junio - 23
 */
public class NumberMix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long reverso1 =0, reverso2 = 0 , vueltaPar = 0, vueltaPar2 = 0, digito1 = 0, digito2 = 0;

        System.out.print("Por favor, introduzca un número: ");
        long numero = sc.nextLong();
        System.out.print("Introduzca otro número: ");
        long numero2 = sc.nextLong();

        long aux1 = numero;
        long aux2 = numero2;

        while (aux1 > 0) {
             reverso1 = (reverso1 * 10) + (aux1 % 10) ;
            aux1 /= 10;
        }
        while (aux2 > 0) {
            reverso2 = (reverso2 * 10) + (aux2 % 10) ;
            aux2 /= 10;
        }

        vueltaPar = reverso1;
        vueltaPar2 = reverso2;
        System.out.print("El número formado por los dígitos pares es: ");
        do {
            digito1 = vueltaPar % 10;
            digito2 = vueltaPar2 % 10;

            if (digito1 % 2 == 0) {
                System.out.print(digito1);
            }
            if (digito2 % 2 == 0) {
                System.out.print(digito2);
            }
            vueltaPar /= 10;
            vueltaPar2 /= 10;
        } while (vueltaPar > 0 || vueltaPar2 > 0);
        System.out.println();
        // Impares
        System.out.print("El número formado por los dígitos impares es: ");
        do {
            digito1 = reverso1 % 10;
            digito2 = reverso2 % 10;

            if (digito1 % 2 != 0) {
                System.out.print(digito1);
            }
            if (digito2 % 2 != 0) {
                System.out.print(digito2);
            }
            reverso2 /= 10;
            reverso1 /= 10;
        } while (reverso1 > 0 || reverso2 > 0);
    }
}
