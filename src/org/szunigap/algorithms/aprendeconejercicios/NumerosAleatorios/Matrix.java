package NumerosAleatorios;
/*
    Programa: Ejercicio 12
    Desarrollador: Saúl Zúñiga
    Descripción: Realiza un programa que llene la pantalla de caracteres aleatorios ( a lo matrix)
                con el código ascii entre 32 y el 126. Puedes hacer casting con (char) para convertir
                un entero en un carácter.
    Fecha: JUNIO - 23
 */
public class Matrix {
    public static void main(String[] args) throws InterruptedException {
        int linea = 0;
        System.out.print("\033[32m"); // color verde

        for (int i = 0; i < 100; i++){
            System.out.print((char) (Math.random() * (126 - 32 + 1) + 32));

            if (linea++ == 60) {
                linea = 0;
                Thread.sleep(50);
                System.out.println();
            }
        }
    }
}
