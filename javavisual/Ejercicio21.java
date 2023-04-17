
import java.util.*;

public class Ejercicio21 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce la nota que has sacado en el primer examen");
        int nota1 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce la nota que has sacado en el segundo examen");
        int nota2 = Integer.parseInt(s.nextLine());

        if (nota1 + nota2 >= 5 ){
            System.out.println("Estas aprobado");
        }

        else if (nota1 + nota2 < 5){
            System.out.println("¿Cual ha sido el resultado de la calificación(apto/no apto");
            String nota3;
            nota3 = System.console().readLine();

            if (nota3.equals("no apto")){
                System.out.println("Has suspendido");
            }
            else {
                System.out.println("Has aprobado con un 5");
            }

        }
    }
}
