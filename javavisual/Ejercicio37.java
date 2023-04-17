import java.util.*;

public class Ejercicio37 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce un número");
        int num1 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce otro número");
        int num2 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce un último número");
        int num3 = Integer.parseInt(s.nextLine());
     
        int ope;
        if (num1 < 10 || num2 < 10 || num3 < 10){
            System.out.println("Alguno de los números es menor que 10");
        }

    }
}