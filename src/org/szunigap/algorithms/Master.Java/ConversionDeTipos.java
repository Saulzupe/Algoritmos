public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        //Convirtiendo a entero
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt); //imprimiendo el string convertidoi
        //convirtiendo el string realStr a Double
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = "  + realDouble);
        //Convirtiendo un string true a un booleano
        String logicoStr = "True";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        //Convirtiendo un numero a String
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // Otra forma de convertir tipos de datos llamada sobre carga de metodos
        // (mismo metodo pero diferentes argumentos o parametros
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        //Convirtiendo un double a un string
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        //Convirtiendo con sobrecarga de metodos
        otroRealStr = String.valueOf(1.2345e2f);
        System.out.println("otroRealStr = " + otroRealStr);
        // convirtiendo un in a short mediante un cast (forzando)
        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);

        float f = (float) i;
        System.out.println("f = " + f);
    }
}
