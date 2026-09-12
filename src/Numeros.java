public class Numeros implements InterfazNumeros {

    @Override
    public int contarNumeros(String frase) {
        int numeros = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter >= '0' && caracter <= '9') {
                numeros++;
            }
        }
        return numeros;
    }
}
