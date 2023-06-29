package NumerosAleatorios;
/*
* Programa: Ejercicio 15 Generador de melodía
* Programador: Saúl Zúñiga
* Descripción: Realizar un generador de melodía con las siguientes condiciones
*               a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, sol, la y si
*               b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor
*                   o igual a 28 y siempre múltiplo de 4 (4,8,12...)
*               c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante
*                   la barra vertical "|". El final de la melodía se marca con dos barras.
*               d) La última nota de la melodía debe coincidir con la primera...
* */
public class GeneradorDeMelodia {
    public static void main(String[] args) {
        int generarNota;
        int generarMelodia = 4 * (int) (Math.random() * 7) + 1;
        String nota = "", primerNota = "";
        //System.out.println("generarMelodia = " + generarMelodia);
        // Generando la nota al azar y melodia
        for (int i = 1; i <= generarMelodia; i++) {

            generarNota = (int) (Math.random() * 7) + 1;

            switch (generarNota) {
                case 1:
                    nota = "do";
                    break;
                case 2:
                    nota = "re";
                    break;
                case 3:
                    nota = "mi";
                    break;
                case 4:
                    nota = "fa";
                    break;
                case 5:
                    nota = "sol";
                    break;
                case 6:
                    nota = "la";
                    break;
                case 7:
                    nota = "si";
                    break;
                default:
                    System.out.println("No se genero nota");
                    break;
            } // termina el switch

            // Igualamos la nota inicial con la final
            if (i == 1) {
                primerNota = nota;
            }
            if (i == generarMelodia) {
                nota = primerNota;
            }
            // imprimimos la nota
            System.out.print(nota + " ");
            // Si llega al final imprimimos dos barritas si es cada 4 notas imprimimos una
            if (i == generarMelodia) {
                System.out.print("||");
            } else if (i % 4 == 0) {
                System.out.print("| ");
            }
        } // Termina el for

    }
}
