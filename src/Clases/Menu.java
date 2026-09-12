package Clases;

import Interfaces.InterfazMenu;

import java.util.Scanner;

public class Menu implements InterfazMenu {

    @Override
    public void menu(Scanner sc, String frase) {
        int opcion;
        do {
            System.out.println("-----MENÚ-----");
            System.out.println("1. Contar el total de caracteres");
            System.out.println("2. Contar el numero de espacios");
            System.out.println("3. Contar el numero de vocales y consonantes");
            System.out.println("4. Contar el numero de numeros");
            System.out.println("5. Contar el numero de mayúsculas y minúsculas");
            System.out.println("6. Contar el numero de caracteres por palabra");
            System.out.println("7. Contar cuantas veces se repite un caracter por palabra");
            System.out.println("8. Contar cuantas veces se repite un caracter en el texto");
            System.out.println("9. Salir");
            System.out.println();
            System.out.println("Qué acción quiere realizar?");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    TotalCaracteres contador = new TotalCaracteres();
                    int total = contador.obtenerTotalCaracteres(frase);
                    System.out.println("El número total de caracteres es: " + total);
                    break;
                case 2:
                    Espacios contadorEspacios = new Espacios();
                    int totalEspacios = contadorEspacios.contarEspacios(frase);
                    System.out.println("El número de espacios es: " + totalEspacios);
                    break;
                case 3:
                    VocalesConsonantes analizadorVC = new VocalesConsonantes();
                    analizadorVC.contarVocalesYConsonantes(frase);
                    break;
                case 4:
                    Numeros contadorNumeros = new Numeros();
                    int totalNumeros = contadorNumeros.contarNumeros(frase);
                    System.out.println("El número de números es: " + totalNumeros);
                    break;
                case 5:
                    MayusculasMinusculas analizadorMayMin = new MayusculasMinusculas();
                    analizadorMayMin.contarMayusculasMinusculas(frase);
                    break;
                case 6:
                    CaracteresPorPalabra analizadorPalabras = new CaracteresPorPalabra();
                    analizadorPalabras.contarCaracteresPorPalabra(frase);
                    break;
                case 7:
                    CaracterPorPalabra analizadorFrecuenciaPalabra = new CaracterPorPalabra();
                    analizadorFrecuenciaPalabra.contarCaracterPorPalabra(sc, frase);
                    break;
                case 8:
                    FrecuenciaCaracterTexto analizadorTextoTotal = new FrecuenciaCaracterTexto();
                    analizadorTextoTotal.contarCaracterEnTexto(sc, frase);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 9);
    }
}