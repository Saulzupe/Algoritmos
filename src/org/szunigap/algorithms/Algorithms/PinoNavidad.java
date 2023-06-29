package org.szunigap.algorithms.Algorithms;

public class PinoNavidad {
    public static void main(String[] args) {
        int height = 10;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos de color verde
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("\033[32m*\033[0m");
            }
            System.out.println();
        }
        // Tronco
        for (int i = 1; i <= height / 2; i++) {
            for (int j = 1; j <= height - 1; j++) {
                System.out.print(" ");
            }
            //Color tronco
            System.out.println("\033[33m||\033[0m");
        }
        System.out.println("Feliz Navidad a todos");
    }
}
