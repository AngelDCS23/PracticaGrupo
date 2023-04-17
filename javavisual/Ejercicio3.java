import java.util.Scanner;

/*Ejercicio4 (Introduce un número y te dice que día de la semana es)
 * 
 * 
 */

public class Ejercicio3 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);

        int num;
        System.out.println("Introduce un número");
        num =Integer.parseInt(s.nextLine());
        String dia = "";

        switch (num){
        case 1:
            dia = "Lunes";
            break;
        
        case 2:
            dia = "Martes";
            break;

        case 3:
            dia = "Miercoles";
            break;

        case 4:
            dia = "Jueves";
            break;

        case 5:
            dia = "Viernes";
            break;

        case 6:
            dia = "Sabado";
            break;

        case 7:
            dia = "Domingo";
            break;
        }

        System.out.println("Estamos a " + dia);
    }
}
