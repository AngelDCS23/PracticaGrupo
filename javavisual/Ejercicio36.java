import java.util.*;

public class Ejercicio36 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce un número");
        int num1 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce otro número");
        int num2 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce un último número");
        int num3 = Integer.parseInt(s.nextLine());
     
        int ope;
        if (num1 == num2 && num2 == num3){
            ope = (num1 + num2) * num3;

            System.out.println("El resultado es " + ope);
        }

        else {
            System.out.println("Los tres números no son iguales");
        }
    }
}