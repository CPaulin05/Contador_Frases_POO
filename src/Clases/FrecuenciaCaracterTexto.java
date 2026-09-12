package Clases;

import Interfaces.InterfazFrecuenciaCaracterTexto;
import java.util.Scanner;

public class FrecuenciaCaracterTexto implements InterfazFrecuenciaCaracterTexto {

    @Override
    public void contarCaracterEnTexto(Scanner sc, String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            System.out.println("La frase está vacía.");
            return;
        }

        String texto = frase.toLowerCase().replaceAll("\\s+", "");

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            boolean yaProcesado = false;
            for (int j = 0; j < i; j++) {
                if (texto.charAt(j) == c) {
                    yaProcesado = true;
                    break;
                }
            }

            if (!yaProcesado) {
                int contador = 0;
                for (int k = 0; k < texto.length(); k++) {
                    if (texto.charAt(k) == c) {
                        contador++;
                    }
                }

                String vezTexto = (contador == 1) ? "1 vez" : contador + " veces";
                System.out.println(c + " " + vezTexto);
            }
        }
    }
}