package Ciclos;

public class MuestraNumeros {
    public static void main(String[] args) {
        // Mostrando los numeros del 320 al 160 contando de 20 en 20 hacia atrás
        System.out.println("==== = For  =====");
        for (int i = 320; i >= 160; i-=20) {
            System.out.println(i);
        }
        System.out.println("====== while =====");
        int contador = 320;
        while (contador >= 160){
            System.out.println(contador);
            contador -= 20;
        }
        System.out.println("===== do while ===");
        contador = 320;
        do {
            System.out.println(contador);
            contador -= 20;
        } while (contador >= 160);
    }
}
