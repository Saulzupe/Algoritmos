/*
    Programa: Ejercicio 2.33 Calculadora del índice de masa corporal
    Programador: Saúl Zúñiga
    Descripción: Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en
                pulgadas ( o, si lo prefiere, el peso del usuario en kilogramos y la altura en metros),
                para que luego calcule y muestre el índice de masa corporal del usuario.
                Muestre además la siguiente información del departamento de Salud y Servicios Humanos
                / Instituto Nacional de Salud para que el usuario pueda evaluar su BMI:

                Valores de BMI
                Bajo peso: menos de 18.5
                Normal: entre 18.5 y 24.9
                Sobrepeso: entre 25 y 29.9
                Obeso: 30 o más
 */
package org.szunigap.algorithms.deitel;

import java.util.Scanner;

public class Ejercicio2_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, altura, bmi;
        int opcion;

        System.out.println("-- -- Calcula del BMI -- --");
        System.out.print("Escoga una opción \n1.-Medidas en Sistema Inglés\n2.-Medidas en Métrico : ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("-- Sistema inglés --");
                System.out.print("Ingrese su peso en libras: ");
                peso = sc.nextFloat();
                System.out.print("Ingrese su altura en Pulgadas: ");
                altura = sc.nextFloat();

                bmi = ((peso * 703)/(altura * altura));

                System.out.println("\nSu BMI es: " + bmi);
            }
            case 2 -> {
                System.out.println("-- Sistema métrico --");
                System.out.print("Ingrese su peso en KG: ");
                peso = sc.nextFloat();
                System.out.print("Ingrese su altura en metros: ");
                altura = sc.nextFloat();

                bmi = (peso)/(altura*altura);
                System.out.println("\nSu BMI es: " + bmi);
            }
        }
        System.out.println();
        System.out.println("VALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso:      30 o más");
    }
}
