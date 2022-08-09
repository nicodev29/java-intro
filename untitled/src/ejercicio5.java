import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        int num;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();

        System.out.println("El doble y el triple del num ingresado es: " + (num*2) + " y " + (num*3));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));



    }
}
