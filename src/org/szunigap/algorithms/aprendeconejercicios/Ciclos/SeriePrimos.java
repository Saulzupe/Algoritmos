package Ciclos;

// Programa: Ejercicio 21 - Aprende Java
// Programador: Saúl Zúñiga
// Descripción: Muestra en pantalla todos los números primos entre 2 y 100, ambos incluidos
// Fecha: Mayo - 2023
public class SeriePrimos {
    public static void main(String[] args) {
        boolean primo;

        for (int i = 2; i <= 100; i++){
            primo = true;
                for (int j = i - 1; j > 1; j--){
                    if ( i % j == 0){
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.print(i + " ");
                }
        }
    }
}
