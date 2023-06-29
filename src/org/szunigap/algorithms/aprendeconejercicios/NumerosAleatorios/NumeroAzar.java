package NumerosAleatorios;

import java.util.Scanner;

/*
    Programa: Ejercicio 5
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
    adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá
    cuántras oportunidades quedan y si el número introducido es mayor que el número secreto.
    Fecha: JUNIO - 23
 */
public class NumeroAzar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oportunidad = 5, cercano, adivino;
        int numeroAzar = (int) ((Math.random() * 100));

        while (oportunidad > 0) {
            System.out.print("Adivina el número: ");
            adivino = sc.nextInt();
            if (adivino > numeroAzar) { System.out.println("El número introducido es mayor"); }
            if (adivino < numeroAzar) { System.out.println("El número introducido es menor"); }
            if (adivino == numeroAzar) { System.out.println("Sorprende adiviniste estoy pensando en el " + numeroAzar); }
            oportunidad--;
            System.out.println("Quedan " + oportunidad + " oportunidades.");
        }

        System.out.println("Pensaba en el " + numeroAzar);
    }
}
