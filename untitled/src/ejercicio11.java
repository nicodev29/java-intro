import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        String resp;
        int num1;

        Scanner leer = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Ingrese la operacion que desea realizar");

        do {
            resp = "";
            num1 = leer.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("Eligio sumar");
                    break;
                case 2:
                    System.out.println("Eligio restar");
                    break;
                case 3:
                    System.out.println("Eligio Multiplicar");
                    break;
                case 4:
                    System.out.println("Eligio Dividir");
                    break;
                case 5:
                    System.out.println("Salir");
                    System.out.println("Esta seguro que desea salir? S/N");
                    leer.nextLine();
                    resp = leer.nextLine();
                    if (resp.equals("S")) {
                        System.out.println("Saliendo del programa");
                    } else {
                        System.out.println("Volviendo al menu");
                    }break;
                    default:
                    System.out.println("Opcion invalida");
            }
        } while (num1 != 5 || !resp.equals("S"));
    }
}
