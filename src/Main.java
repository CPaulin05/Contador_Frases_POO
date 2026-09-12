import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IngresoFrase ingreso = new IngresoFrase();
        String fraseIngresada = ingreso.ingresarFrase(sc);

        Menu menu = new Menu();
        menu.menu(sc, fraseIngresada);
    }
}
