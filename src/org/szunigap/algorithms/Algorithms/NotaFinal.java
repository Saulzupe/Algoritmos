package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Introduzca la nota del primer examen");
        double nota1 = nota.nextDouble();

        System.out.println("¿Que nota quiere sacar en el trimestre? ");
        double notaFinal = nota.nextDouble();
        // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100
        // Por tanto, despejando nota2 tenemos:
        // nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60
        double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
        System.out.println("Para tener un " + notaFinal +
                " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen");
    }
}
