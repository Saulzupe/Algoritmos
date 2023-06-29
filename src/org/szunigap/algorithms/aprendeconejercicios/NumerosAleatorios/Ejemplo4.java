package NumerosAleatorios;

public class Ejemplo4 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");


        for (int i = 1; i <= 20; i++){
            System.out.println(((int) (Math.random() * 10) + 1) + " ");
        }
        System.out.println();

        System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");


        for (int i = 1; i <= 20; i++){
            System.out.println(((int) (Math.random() * 11) + 50) + " ");
        }
        System.out.println();
    }
}
