/*
        Programa: Ejercicio 49 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Utilizando ciclos anidados generar las siguientes terna de números
        1 1 1
        2 1 2
        3 1 3
        4 2 1
        5 3 2
        6 3 3
        ..
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;


public class Ejercicio49 {
    public static void main(String[] args) {
        int contador = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++){
                System.out.println( (contador++) + " " +  i + " " + j);
            }
        }
    }
}
