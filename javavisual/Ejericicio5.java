
import java.util.Scanner;

/*Ejercicio5 (Resuelve ecuaciones tipo(ax+b=0)) 
 * 
 * 
*/

public class Ejericicio5 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);

        int x;
        int a;
        int b;

        System.out.println("Introduce el valor de A");
        a = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el valor de B");
        b = Integer.parseInt(s.nextLine());

        x= a % b;
        
    }    
}
