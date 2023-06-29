package NumerosAleatorios;
/*
    Programa: Ejercicio 5
    Desarrollador: Saúl Zúñiga
    Descripción: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
    espacios. Muestra el máximo, el mínimo y la media de esos números.
    Fecha: JUNIO - 23
 */
public class NumerosAleatorios2 {
    public static void main(String[] args) {
        int max = 0, min = 199, suma = 0;

        for (int i = 1; i <= 50; i++){
            int numeroAl = (int) ((Math.random() * 100) + 100);
            if(numeroAl > max) {
                max = numeroAl;
            }
            if (numeroAl < min) {
                min = numeroAl;
            }
            System.out.print(numeroAl + " " );
            suma += numeroAl;
        }
        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("Media: " + (suma/50));
    }
}
