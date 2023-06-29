/*
    Programa: Ejercicio 2.14 Libro Deitel
    PRogramador: Saúl Zúñiga
    Descripción: Escriba una aplicación que muestre los números del 1 al 4 en la misma línea, con cada par
                de números adyacentes por un espacio. Use las siguientes técnicas:
                a) Mediante una instrucción System.out.println.
                b) MEdiante cuatro instrucciones System.out.print
                c) Mediante una instrucción System.ouy.printf

 */
package org.szunigap.algorithms.deitel;

public class Ejercicio2_14 {
    public static void main(String[] args) {
        System.out.println("12 34");
        System.out.print("12");
        System.out.print(" 34");
        System.out.print(" 12");
        System.out.print(" 34 ");
        System.out.printf("%d%d %d%d", 1,2,3,4);
    }
}
