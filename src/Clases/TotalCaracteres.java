package Clases;

import Interfaces.InterfazTotalCaracteres;

public class TotalCaracteres implements InterfazTotalCaracteres {

    @Override
    public int obtenerTotalCaracteres(String frase) {
        return frase.length();
    }
}
