import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal!.";

       Class strClass =  texto.getClass();
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());

        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
    }
}
