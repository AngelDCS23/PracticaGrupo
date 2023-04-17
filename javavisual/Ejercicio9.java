
import java.util.Scanner;

/*Ejercicio9 (Resolver ecuacion del tipo (ax2 + bx + c = 0)) 
 * 
 * 
*/

public class Ejercicio9{
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);
    
        System.out.println("Introduzca el valor de A");
        int a = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el valor de B");
        int b = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el valor de C");
        int c = Integer.parseInt(s.nextLine());

        int y;

        if (a == 0){
            System.out.println("Error");
        }
    }
}