package NumerosAleatorios;

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 0 y 9");


        for (int i = 1; i <= 20; i++){
            System.out.println((int) (Math.random() * 10) + " ");
        }
        System.out.println();
    }
}
