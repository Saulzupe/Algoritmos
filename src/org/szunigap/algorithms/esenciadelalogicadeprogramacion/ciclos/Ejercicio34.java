/*
        Programa: Ejercicio 33 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Generar los números del 1 al 10 utilizando un ciclo que vaya de 10 a 1
        Fecha:      10/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio34 {
    public static void main(String[] args) {
        int num= 1;
        for (int i = 10; i >= 1; i--) {
            System.out.println(num++);
        }
    }
}
