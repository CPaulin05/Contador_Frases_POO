import java.util.Scanner;

public class IngresoFrase implements InterfazIngresoFrase {

    @Override
    public String ingresarFrase(Scanner sc) {
        System.out.println("Ingresa una frase de máximo 100 caracteres:");
        String frase = sc.nextLine();

        if (frase.length() > 100) {
            System.out.println("Máximo son 100 caracteres.");
        }

        return frase;
    }
}
