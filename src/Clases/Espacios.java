package Clases;

import Interfaces.InterfazEspacios;

public class Espacios implements InterfazEspacios {

    @Override
    public int contarEspacios(String frase) {
        int espacios = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacios++;
            }
        }
        return espacios;
    }
}
