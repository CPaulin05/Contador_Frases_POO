package Clases;

import Interfaces.InterfazCaracteresPorPalabra;
import java.util.Scanner;

public class CaracteresPorPalabra implements InterfazCaracteresPorPalabra {

    @Override
    public void contarCaracteresPorPalabra(Scanner sc, String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            System.out.println("No hay palabras ingresadas.");
            return;
        }

        String[] palabras = frase.trim().split("\\s+");

        System.out.println("Caracteres por palabra:");
        for (String palabra : palabras) {
            System.out.println("Palabra \"" + palabra + "\": " + palabra.length() + " caracteres");
        }
    }
}
