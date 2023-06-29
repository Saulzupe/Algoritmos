/*
Programa: Ejercicios de lógica - LA esencia de la lógica de la programación
Programador: Saúl Zúñiga
Descripción:
             Leer un número entero de dos dígitos
             menor que 20 y determinar si es primo
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.elseif;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        boolean primo = false;
        System.out.print("Ingrese un número menor a 20: ");
        int num = sc.nextInt();
        if (num < 20 && num >= 10) {
            // Leemos un numero entero menor a 10 y determinamos si es primo
            for(int i=2; i < num/2; i++){ // ningun numero es divisible por mas de su mitad
                if(num%i==0){
                    {
                        //System.out.println(num + " No es primo");
                        primo = false;
                        flag=1;
                        break;
                    }
                }
                if (flag == 0) {
                    //System.out.println(num + " es primo");
                    primo = true;
                }
            }

            if (primo) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
        } else {
            System.out.println("No es menor a 20");
        }

    }
}
