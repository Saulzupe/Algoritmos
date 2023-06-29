/*
 * Programa: Sistema estanque de gasolina.
 * Programador: Saúl Zúñiga Pérez
 * Descripción: Suponiendo que un estanque de gasolina con capacidad de 70 litros, se requiere un programa
 * que pida la medida actual en litros y mostrar el resultado de la forma: insuficiente, suficiente, medio...
 * La medida o cpaacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero también
 * puede ser del tipo int.
 * Fecha de creación: 04/05/21
 * Revisión: ninguna.
 */
package org.szunigap.algorithms.curso.homeworks;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner litros = new Scanner(System.in);
        System.out.println("Ingrese la capacidad actual en litros: (46 lts): ");
        double litrosActual = litros.nextDouble();

        if (litrosActual >= 60 && litrosActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if ( litrosActual >= 40 && litrosActual < 60){
            System.out.println("Estanque 3/4");
        } else if ( litrosActual >= 35 && litrosActual < 40 ) {
            System.out.println("Medio Estanque");
        } else if (litrosActual >= 20 && litrosActual < 35) {
            System.out.println("Suficiente");
        } else if (litrosActual >= 1 && litrosActual < 20) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Estanque lleno");
        }

    }
}
