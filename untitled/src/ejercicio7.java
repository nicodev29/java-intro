import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Frase correcta");
        } else {
            System.out.println("Frase incorrecta");
        }

    }
}
