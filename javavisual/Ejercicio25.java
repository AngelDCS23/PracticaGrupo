
import java.util.*;

public class Ejercicio25 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduzca la altura de la bandera");
        int h = Integer.parseInt(s.nextLine());

        System.out.println("Introduzca la anchura de la bandera");
        int an = Integer.parseInt(s.nextLine());

        String escudo;
        System.out.println("*Quieres un escudo bordado");
        escudo = System.console().readLine();

        int centcua = h * an;
        double prebase = (centcua * 1)/100;
        
        double premases;
        if (escudo.equals("si")){
            premases = prebase + 2.50;
        }

        else {

        }

        double pret;

        pret = prebase + 3.25;

        System.out.println("El precio total de su bandera es de " + pret + "Euros");
    }

}
