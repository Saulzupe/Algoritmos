/*
    Programa: Ejercicio 2.31 Tabla de cuadrados y Cubos
    Programador: Saúl Zúñiga
    Descripción: Utilizando sólo las técnicas de programación que aprendió en este capítulo, escriba
                una aplicación que calcule los cuadrados y cubos de los números del 0 al 10, y que
                imprima los valores resultantes en formado de table, como se muestra a continuación
 */
package org.szunigap.algorithms.deitel;

public class Ejercicio2_31 {
    public static void main(String[] args) {
        System.out.printf("%s%s%s%n","numero ", "cuadrado ","cubo");
        System.out.printf("%d       %d        %d%n", 0,((int) Math.pow(0,2)) , ((int) Math.pow(0,3)));
        System.out.printf("%d       %d        %d%n", 1,((int) Math.pow(1,2)) , ((int) Math.pow(1,3)));
        System.out.printf("%d       %d        %d%n", 2,((int) Math.pow(2,2)) , ((int) Math.pow(2,3)));
        System.out.printf("%d       %d        %d%n", 3,((int) Math.pow(3,2)) , ((int) Math.pow(3,3)));
        System.out.printf("%d       %d        %d%n", 4,((int) Math.pow(4,2)) , ((int) Math.pow(4,3)));
        System.out.printf("%d       %d        %d%n", 5,((int) Math.pow(5,2)) , ((int) Math.pow(5,3)));
        System.out.printf("%d       %d        %d%n", 6,((int) Math.pow(6,2)) , ((int) Math.pow(6,3)));
        System.out.printf("%d       %d        %d%n", 7,((int) Math.pow(7,2)) , ((int) Math.pow(7,3)));
        System.out.printf("%d       %d        %d%n", 8,((int) Math.pow(8,2)) , ((int) Math.pow(8,3)));
        System.out.printf("%d       %d        %d%n", 9,((int) Math.pow(9,2)) , ((int) Math.pow(9,3)));
        System.out.printf("%d       %d        %d", 10,((int) Math.pow(10,2)) , ((int) Math.pow(10,3)));
    }
}
