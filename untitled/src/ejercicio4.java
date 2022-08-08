import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        int grados,fh;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los grados a convertir: ");
        grados = leer.nextInt();

        fh = 32 + (9 * grados / 5);

        System.out.println("Los grados convertidos a farenheit son: " + fh);

    }
}
