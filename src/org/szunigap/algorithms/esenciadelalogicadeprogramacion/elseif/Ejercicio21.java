// Programa: Logica de programación
// Programador: Saúl Zúñiga
// Descripción:
//          *Leer tres números enteros de dos dígitos cada uno y determinar en cuál de ellos se
//           se encuentra el mayo dígito.

package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: (2 digitos) ");
        int numero1 = sc.nextInt();;
        System.out.print("Ingrese otro número: (2 digitos) ");
        int numero2 = sc.nextInt();
        System.out.print("Ingrese otro número: (2 digitos) ");
        int numero3 = sc.nextInt();
        sc.close();
        System.out.println();

        if (((numero1 < 100) && (numero1 >=10)) && ((numero2 < 100) && (numero2 >=10))
                && ((numero3 < 100) && (numero3 >=10))) {

            int digito1Numero1 = numero1 / 10;
            int digito2Numero1 = numero1 % 10;

            int digito1Numero2 = numero2 / 10;
            int digito2Numero2 = numero2 % 10;

            int digito1Numero3 = numero3 / 10;
            int digito2Numero3 = numero3 % 10;

            if(     (digito1Numero1 > digito1Numero2) &&
                    (digito1Numero1 > digito2Numero2) &&
                    (digito1Numero1 > digito1Numero3) &&
                    (digito1Numero1 > digito2Numero3) ||
                    (digito2Numero1 > digito1Numero2) &&
                            (digito2Numero1 > digito2Numero2) &&
                            ( digito2Numero1 > digito1Numero3) &&
                            (digito2Numero1 > digito2Numero3)){
                System.out.println(" El mayor digito lo tiene: " + numero1);
            } else if((digito1Numero2 > digito1Numero1) &&
                    (digito1Numero2 > digito2Numero1) &&
                    (digito1Numero2 > digito1Numero3) &&
                    (digito1Numero2 > digito2Numero3) ||
                    (digito2Numero2 > digito1Numero1) &&
                            (digito2Numero2 > digito2Numero1) &&
                            ( digito2Numero2 > digito1Numero3) &&
                            (digito2Numero2> digito2Numero3)) {
                System.out.println(" El mayor digito lo tiene: " + numero2);
            } else if((digito1Numero3 > digito1Numero1) &&
                    (digito1Numero3 > digito2Numero1) &&
                    (digito1Numero3 > digito1Numero2) &&
                    (digito1Numero3 > digito2Numero2) ||
                    (digito2Numero3 > digito1Numero2) &&
                            (digito2Numero3 > digito2Numero2) &&
                            ( digito2Numero3 > digito1Numero1) &&
                            (digito2Numero3> digito2Numero1)){
                System.out.println(" El mayor digito lo tiene: " + numero3);
            } else {
                System.out.println("Hay digitos repetidos");
            }
        }else {
            System.out.println("No son de 3 dígitos");
        }
    }
}
