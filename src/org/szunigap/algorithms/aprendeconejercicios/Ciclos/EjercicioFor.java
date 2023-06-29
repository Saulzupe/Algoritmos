package Ciclos;

public class EjercicioFor {
    public static void main(String[] args) {
        // Muestra los números múltiplos de 5 de 0 a 100 for
        System.out.println("=========== For ================");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("====== while =========");
        int bandera = 0;
        while (bandera <= 100) {
            if (bandera % 5 == 0) {
                System.out.println(bandera);
            }
            bandera++;
        }

        System.out.println("============= Do While ===============");
        bandera = 0;
        do {
            if ( bandera % 5 == 0) {
                System.out.println(bandera);
            }
            bandera++;
        } while (bandera <= 100);
    }
}
