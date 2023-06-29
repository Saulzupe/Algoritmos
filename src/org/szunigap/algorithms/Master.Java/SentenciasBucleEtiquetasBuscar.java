public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if ( frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '"+ palabra +"' en la frase");

       /*
        Search a letter into phrase
        int max = frase.length();
        int cantidad = 0;
        char letra = 'g';

        for (int i = 0; i < max; i ++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '"+letra+"' en la frase");*/
    }
}
