/*
Programa: Ejercicios de lógica de programación
Programador: Saúl Zúñiga Pérez
Descripción: * Leer dos números enteros y si la diferencia entre los dos números es par
                mostrar en pantalla la suma de los dígitos de los números, si dicha
                diferencia es un número primo menor que 10 entonces mostrar en pantalla el
                producto de los dos números y si la diferencia entre ellos termina en 4
                mostrar en pantalla todos los dígitos por separado.


Fecha:      22/08/22
Revisión : Ninguna
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diferencia = 0, dig1Numero1  = 0, dig2Numero1 = 0, dig3Numero1 = 0, dig1Numero2 = 0, dig2Numero2 = 0,
                dig3Numero2 = 0, dig1Diferencia = 0, dig2Diferencia = 0, dig3Diferencia = 0, aux1, aux2, aux3;
        System.out.print("Ingresa un número entero: \r");
        int numero1 = sc.nextInt();
        System.out.print("Ingresa otro número entero: \r");
        int numero2 = sc.nextInt();

        if (numero1 > numero2){
            diferencia = numero1 - numero2;
        } else if (numero2 > numero1){
            diferencia = numero2 - numero1;
        }

        if ((numero1 > 10 && numero1 < 100) || (numero2 > 10 && numero2 < 100) || (diferencia > 10 && diferencia < 100) ){
             dig1Numero1 = numero1 / 10;
             dig2Numero1 = numero1 % 10;

             dig1Numero2 = numero2 / 10;
             dig2Numero2 = numero2 % 10;

             dig1Diferencia = diferencia / 10;
             dig2Diferencia = diferencia % 10;
        } else if ((numero1 > 100 && numero1 < 1000) || (numero2 > 100 && numero2 < 1000) || (diferencia > 100 && diferencia < 1000)){
            dig1Numero1 = numero1 / 100;
            aux1 = numero1 % 100;
            dig2Numero1 = aux1 / 10;
            dig3Numero1 = aux1 % 10;

            dig1Numero2 = numero2 / 100;
            aux2= numero2 % 100;
            dig2Numero2 = aux2 / 10;
            dig3Numero2 = aux2 % 10;

            dig1Diferencia = diferencia / 100;
            aux3 =          diferencia % 100;
            dig2Diferencia = diferencia / 10;
            dig3Diferencia = diferencia % 10;
        }

       int par = (diferencia % 2 == 0) ? (dig1Numero1 + dig2Numero1 +
                    dig3Numero1 + dig1Numero2 + dig2Numero2 +dig3Numero2) : 0 ;

        System.out.println("Suma Digitos = " + par);

        if ( diferencia==2 || diferencia == 3 || diferencia == 5 || diferencia == 7){
            int producto = numero1 * numero2;
            System.out.println("producto = " + producto);
        }

        if (dig2Diferencia == 4  ) {
            System.out.println("dig1Numero1 = " + dig1Numero1);
            System.out.println("dig2Numero1 = " + dig2Numero1);
            System.out.println("dig1Numero2 = " + dig1Numero2);
            System.out.println("dig2Numero2 = " + dig2Numero2);
        } else if ( dig3Diferencia == 4){
            System.out.println("dig1Numero1 = " + dig1Numero1);
            System.out.println("dig2Numero1 = " + dig2Numero1);
            System.out.println("dig3Numero1 = " + dig3Numero1);
            System.out.println("dig1Numero2 = " + dig1Numero2);
            System.out.println("dig2Numero2 = " + dig2Numero2);
            System.out.println("dig3Numero2 = " + dig3Numero2);

        }
    }

}
