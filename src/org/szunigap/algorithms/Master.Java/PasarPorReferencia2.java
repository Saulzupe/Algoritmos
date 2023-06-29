class Persona {
 private String nombre;

 public void modificarNombre(String nuevoNombre){
     this.nombre = nuevoNombre;
 }
 public String leerNombre(){
     return this.nombre;
 }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.modificarNombre("Chiquito Papi");
        System.out.println("Iniciamos el método main");
        System.out.println("persona.nombre = " + persona.leerNombre());
        test(persona);

        System.out.println("Después de llamar el método test");
        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de la clase Persona");
    }

    public static void test (Persona persona) {
        System.out.println("Iniciamos el método Test ");
        persona.modificarNombre("Saul");
        System.out.println("Finaliza el metodo Test");
    }
}
