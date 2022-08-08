import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

    String frase;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();

        System.out.println("La frase ingresada en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase ingresada en minusculas es: "+ frase.toLowerCase());

    }
}
