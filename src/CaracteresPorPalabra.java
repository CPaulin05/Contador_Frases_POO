public class CaracteresPorPalabra implements InterfazCaracteresPorPalabra {

    @Override
    public void contarCaracteresPorPalabra(String frase) {
        String[] palabras = frase.trim().split("\\s+");

        if (frase.trim().isEmpty()) {
            System.out.println("No hay palabras ingresadas.");
            return;
        }

        System.out.println("Caracteres por palabra:");
        for (String palabra : palabras) {
            System.out.println("Palabra \"" + palabra + "\": " + palabra.length() + " caracteres");
        }
    }
}
