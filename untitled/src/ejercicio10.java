import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        int max,suma,x;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor max: ");
        max = leer.nextInt();
        suma = 0;

        while (max > suma) {
            System.out.println("Ingrese numeros hasta superar el limite: ");
            x = leer.nextInt();
            suma = suma + x;
            if (suma > max) {
                System.out.println("Se supero el limite " + max + " con " + suma);
            }

        }
    }
}
