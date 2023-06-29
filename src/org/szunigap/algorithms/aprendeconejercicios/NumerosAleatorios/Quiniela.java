package NumerosAleatorios;
/*
    Programa: Ejercicio 12
    Desarrollador: Saúl Zúñiga
    Descripción: Programa que muestre tres apuestar de la quiniela en tres columnas para los 14 partidos
    y el pleno al quience (quince filas)
    Fecha: JUNIO - 23
 */
public class Quiniela {
    public static void main(String[] args) {
        int resultdadoPartido;
        int columnas = 3;

        for (int fila= 1; fila <= 14; fila++){
            System.out.printf("%2d. |", fila);
            for (int apuesta = 1; apuesta <= columnas; apuesta++){
                resultdadoPartido = (int) (Math.random() * 6 ) + 1; //probabilidad de 3/6 y 2/6, sin (* 3 + 1
                switch (resultdadoPartido) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print("1 |");
                        break;
                    case 4:
                    case 5:
                        System.out.print(" X |");
                        break;
                    case 6:
                        System.out.print(" 2|");
                        break;
                    default:
                        System.out.println(" ... not found");
                }
            }
            System.out.println();
        }

        // Pleno 15
        System.out.println("Pleno al 15 - Local ...");
        int goles = (int) (Math.random() * 4);
        System.out.print(goles < 3 ? goles: "M");

        System.out.print(" Visitante...");
        goles = (int) (Math.random() * 4);
        System.out.println(goles < 3 ? goles : " M ");
    }
}
