import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int num1,num2,resultado;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros para sumar: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        resultado = num1+num2;

        System.out.println("La suma de los numeros ingresados es: " + resultado);

    }

}
