package NumerosAleatorios;
/*
    Programa: Ejercicio 12
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los datos tengan
    el mismo valor.
    Fecha: JUNIO - 23
 */
public class TiradaDadosV2 {
    public static void main(String[] args) {
        int dado1 , dado2;

        do {
            dado1 = Dado();
            dado2 = Dado();
            System.out.println("Dado 1: " + dado1 + " Dado 2: " + dado2);
        } while (dado1 != dado2);


    }

    public static int Dado(){
        return (int) (Math.random() * 6) + 1;
    }
}
