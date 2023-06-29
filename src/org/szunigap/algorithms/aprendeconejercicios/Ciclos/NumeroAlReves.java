package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 25
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que pida unnúmero por teclado y que luego muestre ese
                  número al revés
    Fecha: Mayo - 23
 */
public class NumeroAlReves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverso = 0;
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int aux = numero;
        while (aux!=0) {
            reverso = (reverso * 10) + (aux % 10) ;
            aux /= 10;
        }

        System.out.println("Número ingresado: " + numero + " , número volteado " + reverso);
    }
}
