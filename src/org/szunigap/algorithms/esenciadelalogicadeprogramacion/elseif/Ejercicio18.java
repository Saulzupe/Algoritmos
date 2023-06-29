// Programa: Logica de programación libro la esencia de la lógica ( tres digitos)
// Programador: Saúl Zúñiga Pérez
// Descripción:
//              * Leer un número entero de tres dígitos y determinar si algún dígito es múltiplo de los otros.
// Fecha: 01/08/22
// Revisión ninguna
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de tres dígitos: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero < 1000){
            int dig = numero / 100;
            int aux = numero % 100;
            int dig2 = aux / 10;
            int dig3 = aux % 10;
            multiplo(dig, dig2, dig3);

        } else {
            System.out.println("No es de 3 dígitos");
        }
    }

    static void multiplo(int dig, int dig2, int dig3) {
        if ((dig  % dig2 == 0) && (dig % dig3 == 0)){
            System.out.println(dig + " Es multiplo de: " + dig2 + " " + dig3);
        } else if ((dig2  % dig == 0) && (dig2 % dig3 == 0)){
            System.out.println(dig2 + " Es multiplo de: " + dig + " " + dig3);
        }else if ((dig3  % dig == 0) && (dig3 % dig2 == 0)){
            System.out.println(dig2 + " Es multiplo de: " + dig + " " + dig3);
        } else {
            System.out.println("No tiene ningún multiplo");
        }
    }
}
