public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
       String a = "a";
       String b = "b";
       String c = a;

       StringBuilder sb = new StringBuilder(a);
       // medimos el tiempo de ejecución
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 8ms
            //c += a + b + "n"; //34ms
            sb.append(a); //0ms
            sb.append(b);
            sb.append("\n");
        }

        // Finalizamos la medición de tiempo
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
    }
}
