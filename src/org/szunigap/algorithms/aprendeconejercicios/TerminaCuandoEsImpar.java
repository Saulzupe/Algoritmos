package org.szunigap.algorithms.aprendeconejercicios;

import java.util.Scanner;

/*
       Bucle do-while que termina cuando se introduce por teclado un número impar.
 */
public class TerminaCuandoEsImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        char opc = 's';

while (opc == 's') {
    System.out.print("Dime un número: ");
    numero = sc.nextInt();
    System.out.println("¿Desea continuar? (S/N)");
    opc = sc.next().charAt(0);
    if (opc == 'n' || opc == 'N'){
        break;
    }
    do {
        System.out.print("Dime un número: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Ingresaste un par " + numero);
        } else {
            System.out.println("Ingresaste un impar");

        }
    } while (numero % 2 == 0);
}
    }
}
