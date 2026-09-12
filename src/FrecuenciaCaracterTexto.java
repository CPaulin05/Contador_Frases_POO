import java.util.Scanner;

public class FrecuenciaCaracterTexto implements InterfazFrecuenciaCaracterTexto {

    @Override
    public void contarCaracterEnTexto(Scanner sc, String frase) {
        System.out.println("Ingresa el carácter que deseas buscar en el texto:");
        String entrada = sc.nextLine();

        if (entrada.isEmpty()) {
            System.out.println("No ingresaste ningún carácter.");
            return;
        }

        char caracterBuscado = entrada.charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracterBuscado) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracterBuscado + "' se repite " + contador + " vez/veces en el texto total.");
    }
}