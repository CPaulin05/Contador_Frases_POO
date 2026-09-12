public class VocalesConsonantes implements InterfazVocalesConsonantes {

    @Override
    public void contarVocalesYConsonantes(String frase) {
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toUpperCase(frase.charAt(i));

            if (caracter == 'A' || caracter == 'E' ||
                    caracter == 'I' || caracter == 'O' ||
                    caracter == 'U' || caracter == 'Á' ||
                    caracter == 'É' || caracter == 'Í' ||
                    caracter == 'Ó' || caracter == 'Ú') {
                vocales++;
            } else if (caracter >= 'A' && caracter <= 'Z') {
                consonantes++;
            }
        }

        System.out.println("El número de vocales es: " + vocales);
        System.out.println("El número de consonantes es: " + consonantes);
    }
}
