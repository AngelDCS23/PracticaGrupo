import java.util.*;

public class Ejercicio38 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce el valor de X");
        int num1 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el valor de Y");
        double num2 = Integer.parseInt(s.nextLine());

        if (num1 > 0 && num2 > 0.2){
            System.out.println("Estas en el primer Cuadrante");
        }

        else if (num1 < 0 && num2 < 0){
            System.out.println("Estas en el segundo cuadrante");
        }

    }
}