package NumerosAleatorios;
/*
    Programa: Ejercicio 2
    Desarrollador: Saúl Zúñiga
    Descripción:Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
    Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y treboles. Cada palo
    esta formado por 13 cartas de las cuales 9 cartas son numerales y 4 literales: 2,3,4,5,6,7,8,9,10
    J, Q, K y A Para convertir un número en una cadena de caracteres podemos usar stringvalueof(n)
    Fecha: JUNIO - 23
 */
public class BarajaFrancesa {
    public static void main(String[] args) {
        System.out.println("Mostrando una carta al azar");

        int palo = (int) ((Math.random() * 4 ) + 1) ;

        switch (palo){
            case 1:
                escogiendoCarta();
                System.out.print(" Picas");
                break;
            case 2:
                escogiendoCarta();
                System.out.print(" Corazones");
                break;
            case 3:
                escogiendoCarta();
                System.out.print(" Diamantes");
                break;
            case 4:
                escogiendoCarta();
                System.out.print(" Tréboles");
                break;
            default:
                System.out.println("No hay carta");
        }

    }

    private static void escogiendoCarta() {
        String cartaEdit = "";
        int carta = (int) ((Math.random() * 13) + 1);
        switch (carta){
            case 1:
                System.out.print("A");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.println("Q");
                break;
            case 13:
                System.out.print("K");
                break;
            default:
              cartaEdit = String.valueOf(carta);
        }
        System.out.print(cartaEdit);
    }
}
