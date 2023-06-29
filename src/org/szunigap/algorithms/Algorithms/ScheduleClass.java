/* Programa: Ejercicio 3
 *  Programador: Saul Zúñiga
 *  Descripción: Escribe un programa que muestre tu horario de clase. Puedes usar espacios o
 *               tabuladores para alinear el texto.
 *  Fecha: 06/05/22
 *  Revisión: Ninguna
 */

package org.szunigap.algorithms.Algorithms;

public class ScheduleClass {
    public static void main(String[] args) {
        String azul = "\u001B[34m";
        String materia = "Seguridad Computacional";
        String hora = "14:00 a 16:00";

        System.out.println( azul+"\t" + materia + " - " + hora);
    }
}
