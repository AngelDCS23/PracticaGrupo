
import java.util.*;

public class Ejercicio31 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int num1 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el segundo número");
        int num2 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el tercero número");
        int num3 = Integer.parseInt(s.nextLine());

        if (num1 > num2 && num1 > num3){
            System.out.println("El " + num1 + "es el mayor de los tres");
        }

        else if (num2 > num1 && num2 > num3){
            System.out.println("El" + num2 + "es el mayor de los tres");
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("El" + num3 + "es el mayor de los tres");
        }


    }
}
