package NumerosAleatorios;

public class SemanaDiaAleatorio {
    public static void main(String[] args) {
        System.out.println("Día de la semana !!");

        int dia = (int) ((Math.random() * 7) + 1);

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No hay mas dias");
        }
    }
}
