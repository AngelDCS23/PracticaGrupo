
import java.util.*;

public class Ejercicio20 {
    public static void main(String[] args){

        Scanner s =  new Scanner (System.in);
        int unidad, decena, centena;

        System.out.println("Introduce el número");
        int num = Integer.parseInt(s.nextLine());
        
        centena = num / 100;
        decena = (num % 100) / 10;
        unidad = (num % 100) % 10;

        if (centena == unidad){
            System.out.println("El numero es capicúa");
        }
        else {
            System.out.println("El número no es capicúa");
            
        }
    }
}
