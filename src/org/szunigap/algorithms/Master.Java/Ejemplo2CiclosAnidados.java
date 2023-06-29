public class Ejemplo2CiclosAnidados {
    public static void main(String[] args) {
        int M1,M2,R;

        System.out.println("Tablas de múltiplizar del 1 al 3");
        for (M1 = 1; M1 <= 3; M1++){
            for (M2 = 1; M2 <= 10; M2++){
                R = M1 * M2;
                System.out.println(M1 + " x " + M2 + " = " + R);
            }
        }
    }
}
