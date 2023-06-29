package org.szunigap.algorithms.Algorithms;

import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        // CREAR MENU DE RESTAURANTE
        Scanner teclado = new Scanner(System.in);

        System.out.println("******** Bienvenido al Back Restaurante *********");
        System.out.println("¿Que desea beber?");
        System.out.println("Opciones: \n 1.- CocaCola \n 2.- Agua Horchata \n 3.-Spritte \n 4.-Cerveza");
        int opcionBebida = teclado.nextInt();

        switch (opcionBebida){
            case 1:
                System.out.println("Has elegido CocaCola");
                break;
            case 2:
                System.out.println("Has elegido Agua Horchata");
                break;
            case 3:
                System.out.println("Has elegido Spritte");
                break;
            case 4:
                System.out.println("Has elegido Cerveza");
                break;
            default:
                System.out.println("No has elegido bebida");
        }

        System.out.println("Platillo principal, escoge uno");
        System.out.println("\n 1.-Tinga \n 2.-Sopa \n 3.-Pozole \n 4.-Tacos \n 5.-Arroz con pollo");
        int opcionComida = teclado.nextInt();

        switch (opcionComida){
            case 1:
                System.out.println("Has elegido Tinga");
                break;
            case 2:
                System.out.println("Has elegido Sopa");
                break;
            case 3:
                System.out.println("Has elegido Pozole");
                break;
            case 4:
                System.out.println("Has elegido Tacos");
                break;
            case 5:
                System.out.println("Arroz con Moles (pollo)");
                break;
            default:
                System.out.println("No has elegido Platillo");
        }
        System.out.println("Segundo plato:");
        System.out.println("Opciones: \n 1.-Milanesa \n 2.- Albóndigas \n 3.-Quesadillas \n 4.- Pechuga gordonblue");
        int opcionComida2 = teclado.nextInt();
        switch (opcionComida2){
            case 1:
                System.out.println("Has elegido Milanesa");
                break;
            case 2:
                System.out.println("Has elegido Albóndigas");
                break;
            case 3:
                System.out.println("Has elegido Quesadillas");
                break;
            case 4:
                System.out.println("Has elegido Pechuga Gordonblue");
                break;
            default:
                System.out.println("No has elegido segundo platillo");
        }

        System.out.println("Preparando la orden...");
    }
}
