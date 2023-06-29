public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        //Convertimos un strin a un array pero imprime el hash del objeto o un identificador
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("\n trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < largo; j++) {
            System.out.println(arreglo[j]);
        }

        String archivo = "alguna.imagen.jsf";
        String[] archivoArr = archivo.split("\\."); // [.]
        l = archivoArr.length;
        System.out.println("l = " + l);
        for (int i = 0; i < l; i++) {
            System.out.println("archivoArr[i] = " + archivoArr[i]);
        }
        System.out.println("extensión = " + archivoArr[l-1]);
    }
}
