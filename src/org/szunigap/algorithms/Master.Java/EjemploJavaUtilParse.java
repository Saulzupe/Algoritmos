import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd' ");
        try { // Convirtiendo una fecha String a un objeto
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            // Creamos una fecha nueva
            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);
            // Comparando Fechas
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es después o mayor que fecha2");
            } else if (fecha.before(fecha2)){
                System.out.println("fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)){
                System.out.println("fecha es igual a fecha2");
            }

            if(fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es después o mayor que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0){
                System.out.println("fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha es igual a fecha 2");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
