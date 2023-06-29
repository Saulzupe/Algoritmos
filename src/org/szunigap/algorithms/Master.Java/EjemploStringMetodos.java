import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Saul";
        // Saber el largo de una cadena
        System.out.println("nombre.length() = " + nombre.length());
        //Convertir a mayuscula
        System.out.println("nombre.toUppercase() = " + nombre.toUpperCase());
        //Convertir a minuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        // Comparando valor de los strings
        System.out.println("nombre.equals(\"Saul\") = " + nombre.equals("Saul"));
        System.out.println("nombre.equals(\"saul\") = " + nombre.equals("saul"));
        System.out.println("nombre.equalsIgnoreCase(\"saul\") = " + nombre.equalsIgnoreCase("saul"));
        System.out.println("nombre.compareTo(\"Saul\") = " + nombre.compareTo("Saul"));
        System.out.println("nombre.compareTo(\"Emanuel\") = " + nombre.compareTo("Saul"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));

        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-2" + ") = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lasIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t) = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith = " + trabalenguas.endsWith("s"));
        System.out.println("trabalenguas");
        System.out.println("    trabalenguas = ".trim());

    }
}
