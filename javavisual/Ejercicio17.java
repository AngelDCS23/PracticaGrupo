
import java.util.Scanner;

public interface Ejercicio17 {
   public static void main(String[] args){

    Scanner s = new Scanner (System.in);   

    System.out.println("introduce un número");
    int num = Integer.parseInt(s.nextLine());

    int ultd;

    ultd = num % 10;

    System.out.println("El último digito de " + num + "es " + ultd);
} 
}
