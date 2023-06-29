/*
        Programa: Ejercicio 50 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Utilizando ciclos anidados generar las siguientes terna de números
        0 1
        1 1
        2 1
        3 1
        4 2
        5 2
        6 2
        7 2
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;


public class Ejercicio50 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++){
                System.out.println( (contador++) + " " +  i );
            }
        }
    }
}
