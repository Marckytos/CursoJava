import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {

        int calificacion;

        Scanner entrada = new Scanner(System.in);

        while(true) {
            System.out.println("Ingresa la calificacion: ");
            calificacion = entrada.nextInt();

            if(calificacion > 10){
                System.out.println("La calificacion maxima es 10, intenta de nuevo");
            } else if(calificacion < 0){
                System.out.println("La calificacion minima es 0, intenta de nuevo");

            }else{
                break;
            }
        }

        if(calificacion >= 6){


            System.out.println("El alumno está aprobado, ya puedes morir en paz");
        }else{

            System.out.println("Ni modo chavo, a recursar");

        }

    }
}

