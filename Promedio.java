public class Promedio {

    public static void main(String[] args) {

        int matematicas = 5;
        int biologia = 7;
        int quimica = 5;

        int promedio = 0;

        promedio = (matematicas + quimica + biologia)/3;

        if(promedio >= 6){
            System.out.println("El alumno aprobó, su promedio fue de: " + promedio);
        } else {
            System.out.println("El alumno reprobó, su promedio fue de: " + promedio);
        }

    }
}
