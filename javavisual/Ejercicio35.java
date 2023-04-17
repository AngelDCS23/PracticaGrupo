import java.util.*;

public class Ejercicio35 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        String mes;
        System.out.println("Introduce el mes");
        mes = System.console().readLine();

        System.out.println("Introduce el día");
        int dia = Integer.parseInt(s.nextLine());

        if (mes.equals("diciembre") && dia == 25){
            System.out.println("!Es navidad!");
        }
        else {
            System.out.println("No es navidad");
        }
        


        
    }
}