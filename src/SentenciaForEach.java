public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,1,31,42,349};
        for (int num: numeros){
            System.out.println("num = " + num);
        }
        String[] nombres = {"Chiquito papi", "Pepe", "María", "Xanat", "Ximena", "Emmanuel", "Yander", "Saul", "Pato"};
        for (String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
