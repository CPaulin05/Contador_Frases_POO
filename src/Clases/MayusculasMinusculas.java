package Clases;

import Interfaces.InterfazMayusculasMinusculas;

public class MayusculasMinusculas implements InterfazMayusculasMinusculas {

    @Override
    public void contarMayusculasMinusculas(String frase) {
        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            }
        }

        System.out.println("El número de mayúsculas es: " + mayusculas);
        System.out.println("El número de minúsculas es: " + minusculas);
    }
}
