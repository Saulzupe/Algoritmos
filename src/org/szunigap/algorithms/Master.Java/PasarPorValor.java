public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main Test con i =" + i);
    }

    public static void test (int i) {
        System.out.println("Iniciamos el método Test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo Test con i =" + i);
    }
}
