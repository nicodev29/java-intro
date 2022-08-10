import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        frase = leer.next();

        if (frase.length() == 8 ) {
            System.out.println("Longitud de frase correcta");
        } else {
            System.out.println("Longitud de frase incorrecta");
        }


    }
}
