
import java.util.*;

public class Ejercicio22 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        System.out.println("¿En que día estas?");
        int dia = Integer.parseInt(s.nextLine());

        System.out.println("Que hora es");
        int hora = Integer.parseInt(s.nextLine());

        System.out.println("Que minuto es");
        int min = Integer.parseInt(s.nextLine());

        System.out.println("Que segundos son");
        int seg = Integer.parseInt(s.nextLine());

        int sem7 = 370800;
        int segt;
        int rest;
        int conv;
        int reg31;
        int reg32;
        int tot = 0;

        switch (dia){
            case 1:
            String dia1 = "";
            if (dia1.equals("lunes")){
                segt = (hora * 3600) + (min * 60) + seg;
                rest = segt - sem7;
                conv = rest * 86400;
                reg31 = ((conv * 100)/4);
                reg32 = ((reg31 * 24)/100);
                tot = 24 - reg32;

            }
            System.out.println(tot);

            }
        }
    }
