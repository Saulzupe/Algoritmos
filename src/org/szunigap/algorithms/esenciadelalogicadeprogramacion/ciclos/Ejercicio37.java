/*
        Programa: Ejercicio 367 Esencia de la lógica de programación libro
        Programador: Saúl Zúñiga
        Descripción: Generar todas las tablas de multiplicar del 1 al 10;
        Fecha:      10/10/22
        Revisión:  Ninguna.
 */
package org.szunigap.algorithms.esenciadelalogicadeprogramacion.ciclos;

public class Ejercicio37 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
           for (int j = 0; j <= 10; j++) {
               System.out.printf("%d x %d = %d%n",i,j,i*j);
               if(j== 10){
                   System.out.println("");
               }
           }
        }
    }
}
