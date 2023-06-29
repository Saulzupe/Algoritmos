package Ciclos;

import java.util.Scanner;

public class MediaDeunConjunto {
    public static void main(String[] args) {
        // Calculando la media de un conjunto de números positivos introducidor por teclado
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        double media = 0.0d, suma = 0.0d;
        System.out.println("Ingrese números  positivos, ingrese un negativo para terminar");

        while (numero >= 0) {
            System.out.print("Número: ");
            numero = sc.nextInt();
            suma += numero;
            contador++;
        }
        suma -= numero; //quitamos el negativo
        media =  suma / (contador - 1); //quitamos la ultima iteracion del negativo y realizamos la media
        System.out.println("La media del conjunto dado es : " + media);
    }
}
