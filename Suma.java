import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num1 = 0, num2 = 0, resultado = 0;


        System.out.println("¿Cuál es tú nombre? ");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor para tu suma: ");
        num1 = in.nextInt();

        System.out.println("Dame el segundo valor para tu suma: ");
        num2 = in.nextInt();

        resultado = num1 + num2;

        System.out.println("Hola " + nombre + ", el resultado de tu suma es: " + resultado);

    }

}
