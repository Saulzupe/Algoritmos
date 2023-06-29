package NumerosAleatorios;

/*
    Programa: Ejercicio 10
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
                El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de
                de los siguientes: *,-,=,.,|,@. Las líneas deben tener una logitud aleatoria
                entre 1 y 40 caracteres.
    Fecha: JUNIO - 23
 */
public class LineasFormadas {
    public static void main(String[] args) {
        int c, longitud;
        String linea = "";
        System.out.println("Pintando lineas!!");

        longitud = (int) ((Math.random() * 40) + 1);
        for (int i = 1; i <= 10; i++) {
            c = (int) ((Math.random() * 6) + 1);

            switch (c) {
                case 1:
                    linea = " *";
                    break;
                case 2:
                    linea = "-";
                    break;
                case 3:
                    linea = "=";
                    break;
                case 4:
                    linea = ".";
                    break;
                case 5:
                    linea = "|";
                    break;
                case 6:
                    linea = "@";
                    break;
                default:
                    System.out.println("No hay caracteres disponibles: ");
            }


            for (int j = 1; j <= longitud; j++) {
                System.out.print(linea);
            }
            System.out.println();
        }
    }
}
