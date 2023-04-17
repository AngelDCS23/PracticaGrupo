
import java.util.*;

public class Ejercicio32 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce un numero");
        int num = Integer.parseInt(s.nextLine());

        if (num < 0){
            System.out.println("El numero negativo");
        }
        if (num == 0){
            System.out.println("El numero neutro");
        }
        if (num > 0){
            System.out.println("El numero positivo");
        }

    }
}
