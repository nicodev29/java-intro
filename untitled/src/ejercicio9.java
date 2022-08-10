import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        String frase;
        int x;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra: ");
        frase = leer.nextLine();
        x = frase.length();

        if (frase.substring(0,1).equals("a")) {
            System.out.println("Correcto, la primera letra es a");
        } else {
            System.out.println("La primera letra no es a ");
        }

    }
}
