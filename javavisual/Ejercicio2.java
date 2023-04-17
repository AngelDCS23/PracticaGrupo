import java.util.Scanner;

/*Ejercicio 2(Comprobador de hora)
 * 
 * 
*/

public class Ejercicio2 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);
        int hora;
        System.out.println("Introduce una hora");
        hora=Integer.parseInt(s.nextLine());
        s.close();
        
        if (hora > 1 && hora >= 5){
            System.out.println("Buenas noches");
        }

        else if (hora >= 6 && hora < 12){
            System.out.println("Buenos dias");
        }

        else if (hora >= 13 && hora < 21){
            System.out.println("Buenas tardes");
        }

        else if (hora >= 21){
            System.out.println("Buenas noches");
        }
    }
}
