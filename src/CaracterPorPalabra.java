import java.util.Scanner;

public class CaracterPorPalabra implements InterfazCaracterPorPalabra {

    @Override
    public void contarCaracterPorPalabra(Scanner sc, String frase) {
        System.out.println("Ingresa el carácter que deseas buscar:");
        String entrada = sc.nextLine();

        if (entrada.isEmpty()) {
            System.out.println("No ingresaste ningún carácter.");
            return;
        }

        char caracterBuscado = entrada.charAt(0);
        String[] palabras = frase.trim().split("\\s+");

        if (frase.trim().isEmpty()) {
            System.out.println("No hay palabras ingresadas.");
            return;
        }

        System.out.println("Frecuencia del carácter '" + caracterBuscado + "' por palabra:");
        for (String palabra : palabras) {
            int contador = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == caracterBuscado) {
                    contador++;
                }
            }
            System.out.println("Palabra \"" + palabra + "\": " + contador + " vez/veces");
        }
    }
}
