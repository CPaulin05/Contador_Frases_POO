package Clases;

import Interfaces.InterfazCaracterPorPalabra;
import java.util.Scanner;

public class CaracterPorPalabra implements InterfazCaracterPorPalabra {

    @Override
    public void contarCaracterPorPalabra(Scanner sc, String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            System.out.println("La frase está vacía.");
            return;
        }

        String[] palabras = frase.trim().split("\\s+");

        for (int p = 0; p < palabras.length; p++) {
            String palabra = palabras[p].toLowerCase();
            System.out.println("palabra " + (p + 1) + ":");

            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.charAt(i);

                boolean yaProcesado = false;
                for (int j = 0; j < i; j++) {
                    if (palabra.charAt(j) == c) {
                        yaProcesado = true;
                        break;
                    }
                }

                if (!yaProcesado) {
                    int contador = 0;
                    for (int k = 0; k < palabra.length(); k++) {
                        if (palabra.charAt(k) == c) {
                            contador++;
                        }
                    }

                    String vezTexto = (contador == 1) ? "1 vez" : contador + " veces";
                    System.out.println(c + " " + vezTexto);
                }
            }
        }
    }
}