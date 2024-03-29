import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno del sistema = " + varEnv);

        System.out.println(" ---- Listando variables de entorno -----");
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 =varEnv.get("Path");
        System.out.println("path = " + path2);
    }
}
