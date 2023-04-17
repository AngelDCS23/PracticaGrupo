
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int num1 = Integer.parseInt(s.nextLine());

        System.out.println("Inrtoduce el segundo número");
        int num2 = Integer.parseInt(s.nextLine());

        System.out.println("Introduce el tercer número");
        int num3 = Integer.parseInt(s.nextLine());

        int menor;
        int intermedio = 0;
        int mayor = 0;

        if (num1 > num2 && num1 > num3){
         mayor = num1;
        }

        else if (num2 > num1 && num2 > num2){
           mayor = num2;

        }
        
        else if (num3 > num1 && num3 > num1){
            mayor = num3;
        }

        if (num1 < num2 && num1 < num3){
            menor = num1;
        }

        else if (num2 < num1 && num2 < num3){
            menor = num2;
        }

        else {
            menor = num3;  
            intermedio = (num1+num2+num3)-(mayor + menor);
        }

        System.out.println("El orden ascendente de los números es el siguiente" + menor + intermedio + mayor);

    }
}
