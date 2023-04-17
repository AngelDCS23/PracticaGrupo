import java.util.*;

public class Ejercicio34 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce un número de preguntas acertadas");
        int num = Integer.parseInt(s.nextLine());

        int porcentaje;

        porcentaje = (num * 100)/100;

        if (porcentaje >= 90){
            System.out.println("Nivel Maximo");
        }
        else if (porcentaje >= 75 && porcentaje < 90){
            System.out.println("Nivel Medio");
        }
        else if (porcentaje >= 50 && porcentaje < 75){
            System.out.println("Nivel Regular");
        }
        else if (porcentaje < 50){
            System.out.println("Fuera de Nivel");
        }
    }
}