package Ciclos;

import java.util.Scanner;

/*
    Programa: Ejercicio 30
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que calcule las horas transcurridas entre dos horas de dos días de
    la semana. No se tendrán en cuenta los minutos ni lo ssegundos. El día de la semana se puede pedir como
    un número (del 1 al 7) o como una cadena (de "lunes" a "domingo"). Se debe comprobar que el usuario
    introduce los datos correctamente y que el segundi día es posterior al primero.
    Fecha: Junio - 23
 */
public class Horas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int diaNumero = 0;
        int diaDosNumero = 0;
        int primerHora = 0;
        int segundaHora = 0;
        String nombrePrimerDia = "";
        String nombreSegundoDia = "";
        String primerDia;
        String segundoDia;
        boolean datosCorrectos = true;
        boolean diaCorrecto;
        boolean diaCorrecto2;
        do{
            System.out.println("Por favor, introduzca la primera hora. ");
            do{
                diaCorrecto = true;
                System.out.print("Día: ");
                primerDia = sc.nextLine();

                switch (primerDia) {
                    case "lunes":
                    case "1":
                        diaNumero = 1;
                        nombrePrimerDia  = "Lunes";
                        break;
                    case "martes":
                    case "2":
                        diaNumero = 2;
                        nombrePrimerDia  = "Martes";
                        break;
                    case "miercoles":
                    case "3":
                        diaNumero = 3;
                        nombrePrimerDia  = "miercoles";
                        break;
                    case "jueves":
                    case "4":
                        diaNumero = 4;
                        nombrePrimerDia  = "Jueves";
                        break;
                    case "viernes":
                    case "5":
                        diaNumero = 5;
                        nombrePrimerDia  = "Viernes";
                        break;
                    case "sabado":
                    case "6":
                        diaNumero = 6;
                        nombrePrimerDia  = "Sabado";
                        break;
                    case "domingo":
                    case "7":
                        diaNumero = 7;
                        nombrePrimerDia  = "Domingo";
                        break;
                    default:
                        diaCorrecto = false;
                        break;
                }
                if (!diaCorrecto) {
                    System.out.println("Los datos introducidos no son correctos");
                    datosCorrectos = false;
                }

            }while (!diaCorrecto);

            System.out.print("Hora: ");
                primerHora = sc2.nextInt();
            if (primerHora < 0 || primerHora > 24) {
                System.out.println("La hora introducida es incorrecta");
            }


            System.out.println("Por favor, introduzca la segunda hora");

            do{
                diaCorrecto2 = true;
                datosCorrectos = true;

                System.out.print("Día: ");
                segundoDia = sc.nextLine();

                switch (segundoDia) {
                    case "lunes":
                    case "1":
                        diaDosNumero= 1;
                        nombreSegundoDia  = "Lunes";
                        break;
                    case "martes":
                    case "2":
                        diaDosNumero = 2;
                        nombreSegundoDia   = "Martes";
                        break;
                    case "miercoles":
                    case "3":
                        diaDosNumero = 3;
                        nombreSegundoDia   = "miercoles";
                        break;
                    case "jueves":
                    case "4":
                        diaDosNumero = 4;
                        nombreSegundoDia   = "Jueves";
                        break;
                    case "viernes":
                    case "5":
                        diaDosNumero = 5;
                        nombreSegundoDia   = "Viernes";
                        break;
                    case "sabado":
                    case "6":
                        diaDosNumero = 6;
                        nombreSegundoDia  = "Sabado";
                        break;
                    case "domingo":
                    case "7":
                        diaDosNumero = 7;
                        nombreSegundoDia  = "Domingo";
                        break;
                    default:
                        diaCorrecto2 = false;
                }
                if (!diaCorrecto2) {
                    System.out.println("El día no es valido");
                }
            }while (!diaCorrecto2);

            System.out.print("Hora: ");
              segundaHora = sc2.nextInt();
            if (segundaHora < 0 || segundaHora > 24) {
                System.out.println("La hora introducida es incorrecta");
                datosCorrectos = false;
            }

            if (diaDosNumero <= diaNumero) {
                System.out.println("El segundo día debe ser posterior");
                datosCorrectos = false;
            }

        }while (!datosCorrectos);

        System.out.println("Entre las " + primerHora + " :00h del " + nombrePrimerDia + " y las " + segundaHora
                + ":00h del " + nombreSegundoDia + " hay "
                + (((diaDosNumero * 24) + segundaHora) - ((diaNumero * 24) + primerHora)) + " hora/s")  ;

    }
}
