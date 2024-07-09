// Hola xd

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Mucho gusto, ¿Cuál es tú nombre ? ");

        nombre = entrada.nextLine();

        System.out.println("Encantado de conocerte " + nombre);

        System.out.println("¿Cuál es tú edad? ");
        edad = entrada.nextInt();
        System.out.println("Entonces te llamas " + nombre + " y tienes " + edad + " años ... " +
                "\n Interesante");

    }
}




