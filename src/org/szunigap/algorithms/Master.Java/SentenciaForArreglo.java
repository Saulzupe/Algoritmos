import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Chiquito papi", "Pepe", "María", "Xanat", "Ximena", "Emmanuel", "Yander", "Saul", "Pato"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].toLowerCase().contains("Pepe".toLowerCase()) ||
             nombres[i].toLowerCase().contains("yAnder".toLowerCase())){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Saul\": ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado ");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sitema");
        }

    }
}
