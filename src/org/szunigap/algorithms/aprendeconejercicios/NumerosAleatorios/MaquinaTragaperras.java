package NumerosAleatorios;
/*
    Programa: Ejercicio 12
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes
                requisitos:
                a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras
                posibles: corazón, diamante, herradura, campana y limón.
                b) Si las tres figuras son diferentes se debe mostrar el mensaje "losiento, ha perdido".
                c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje "Bien, ha
                recuperado su moneda".
                d) Si las tres figuras son iguales se debe mostrar "Enhorabuena, ha ganado 10 monedas".
    Fecha: JUNIO - 23
 */
public class MaquinaTragaperras {
    public static void main(String[] args) {
        int tirada;
        String figura = "", figura1 = "", figura2 = "", figura3 ="";

        for (int i = 1; i <= 3; i++) {
            tirada = (int) (Math.random() * 5 )+ 1;
            switch (tirada) {
                case 1:
                    figura = "Corazón";
                    break;
                case 2:
                    figura = "Diamante";
                    break;
                case 3:
                    figura = "Herradura";
                    break;
                case 4:
                    figura = "Campana";
                    break;
                case 5:
                    figura = "Limón";
                    break;
                default:
                    System.out.println("No hay figuras lo siento...");
                    break;
            }
            if (i == 1) {
                figura1 = figura;
            }
            if (i == 2) {
                figura2 = figura;
            }
            if (i == 3) {
                figura3 = figura;
            }
            System.out.print(figura + " ");

        }
        System.out.println();
        if ((figura1.equals(figura2)) && (figura1.equals(figura3))) {
            System.out.println("En hora buena, ha ganado");
        } else if ((figura1.equals(figura2)) || (figura2.equals(figura3)) || (figura1.equals(figura3))){
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento ha perdido");
        }
    }
}
