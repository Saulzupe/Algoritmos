/* Programa: Ejercicio 9 - Flujos de control
 *  Programador: Saul Zúñiga
 *  Descripción:Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).
 *  Fecha: 16/06/22
 *  Revisión: Ninguna
 */
package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa resuelve una ecuación de segundo grado ax^2 +bx+c=0");
        System.out.println("Ingrese el valor de a: ");
        double a = scan.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = scan.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = scan.nextDouble();

        if ( a == 0 && b == 0 && c == 0){
            System.out.println("Este sistema tiene soluciones infinitas ");
        }
        if ((a==0)  && (b==0) && (c!=0)) {
            System.out.println("La ecuación no tiene solución");
        }
        if ( (a!=0) && (b!=0) && (c==0)){
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b/a));
        }
        if ( (a==0) && (b!=0) && (c!=0)){
            System.out.println("x1 = x2 = " + (-c/b));
        }
        // con a,b y c distintos de 0
        if((a!=0) && (b!=0) && (c!=0) ){
            double dis = Math.pow(b,2) - (4 * a * c);

            if (dis < 0) {
                System.out.println("La ecuación no tiene solución real");
            } else {
               double x1 = (-b + Math.sqrt(dis)) / (2 * a);
               double x2 = (-b - Math.sqrt(dis)) / (2 * a);

                System.out.println("El valor de x1 = " + x1);
                System.out.println("El valor de x2 = " + x2);

            }
        }

    }
}
