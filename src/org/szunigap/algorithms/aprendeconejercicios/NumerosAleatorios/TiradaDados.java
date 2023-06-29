package NumerosAleatorios;
/*
    Programa: Ejercicio 1
    Desarrollador: Saúl Zúñiga
    Descripción: Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también
                    la suma total (los puntos que suman entre los tres dados).
    Fecha: JUNIO - 23
 */
public class TiradaDados {
    public static void main(String[] args) {
        System.out.println("Tirando dados!!!");
        int dado1 = TiradaDado();
        int dado2 = TiradaDado();
        int dado3 = TiradaDado();

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);
        System.out.print("Puntos: " + (dado1+dado2+dado3));
    }

    private static int TiradaDado() {
        return (int) ((Math.random() * 6) + 1);
    }
}
