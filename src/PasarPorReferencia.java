public class PasarPorReferencia {
    public static void main(String[] args) {
        int [] edad = {10,11,12};
        System.out.println("Iniciamos el método main con i = ");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de llamar el método Test");
        test(edad);
        System.out.println("Después de llamar el método Test");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Finaliza el método con los datos del arreglo modificados!");
    }

    public static void test (int[] edadArr) {
        System.out.println("Iniciamos el método Test con i = ");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el metodo Test");
    }
}
