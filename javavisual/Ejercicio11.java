
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Intrduce la hora que es");
        int hora = Integer.parseInt(s.nextLine());

        System.out.println("Introduce los minutos");
        int min = Integer.parseInt(s.nextLine());

        System.out.println("Introduce los segundos");
        int seg = Integer.parseInt(s.nextLine());

        int horar = 0;
        int minr = 0;
        int segr = 0;

        if (hora <= 24){
            horar = hora - 24;
        }

        if (min <= 60){
            minr = min - 60;
        }

        if (seg <= 60){
            segr = seg - 60;
        }

        System.out.println("Son las " + hora + min + seg + "quedan para medianoche" + horar + minr + segr);
    }
}
