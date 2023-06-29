/*
Programa: Ejercicios de lógica de programación
        Programador: Saúl Zúñiga Pérez
        Descripción:
                     * Mostrar en pantalla todos los pares comprendidos entre 20 y 200
        Fecha:     27/08/22
        Revisión

 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio8 {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("\nPares del 20 a 200");
        contador = 20;
        while ( contador <= 200){
            if (contador % 2 == 0){
                System.out.println("Pares = " + contador);
            }
            contador++;
        }
    }
}
