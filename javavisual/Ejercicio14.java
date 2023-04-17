
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce un número");
        int num = Integer.parseInt(s.nextLine());

        if (num % 2 == 0){
            System.out.println("El número es par");
        }
        else if (num % 5 == 0){
            System.out.println("El número es divisible entre 5");
        }
        else {
            System.out.println("El número no es ni par ni divisible entre 5");
        }
    }
}
