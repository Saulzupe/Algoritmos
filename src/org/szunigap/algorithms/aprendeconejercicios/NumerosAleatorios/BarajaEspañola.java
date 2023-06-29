package NumerosAleatorios;
/*
    Programa: Ejercicio 3
    Desarrollador: Saúl Zúñiga
    Descripción: Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
    de 40 cartas: 2,3,4,5,6,7,sota,caballo,rey y as.
    Fecha: JUNIO - 23
 */
public class BarajaEspañola {
    public static void main(String[] args) {
        System.out.println("Mostrando una carta al azar (BarajaEspañola)");

        int palo = (int) ((Math.random() * 4 ) + 1) ;

        switch (palo){
            case 1:
                escogiendoCarta();
                System.out.print(" Oros");
                break;
            case 2:
                escogiendoCarta();
                System.out.print(" Copas");
                break;
            case 3:
                escogiendoCarta();
                System.out.print(" Espadas");
                break;
            case 4:
                escogiendoCarta();
                System.out.print(" Bastos");
                break;
            default:
                System.out.println("No hay carta");
        }

    }

    private static void escogiendoCarta() {
        String cartaEdit = "";
        int carta = (int) ((Math.random() * 40) + 1);
        switch (carta){
            case 1:
                System.out.print("As");
                break;
            case 10:
                System.out.print("Sota");
                break;
            case 11:
                System.out.print("Caballo");
                break;
            case 12:
                System.out.print("Rey");
                break;
            default:
              cartaEdit = String.valueOf(carta);
        }
        System.out.print(cartaEdit);
    }
}
