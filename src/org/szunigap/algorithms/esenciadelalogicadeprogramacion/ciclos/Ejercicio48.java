/*
        Programa: Ejercicio 48 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Utilizando ciclos anidados generar las siguientes parejas de enteros
        0 1
        1 1
        2 2
        3 2
        4 3
        5 3
        ..
        Fecha:      14/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;


public class Ejercicio48 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 2; j++){
                System.out.println( (contador++) + " " +  i);
            }
        }
    }
}
