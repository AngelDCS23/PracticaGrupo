
import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        int preentr = 7;
        String dia;
        System.out.println("¿Que día vas a ir al cine?");
        dia = System.console().readLine();

        System.out.println("¿Cuentas entradas quieres?");
        int entra = Integer.parseInt(s.nextLine());

        double preentrdia;
        if (dia.equals("miercoles")){
            preentrdia = preentr - 3;
        }

        else if (dia.equals("jueves") && (entra % 2 == 0)){
            preentrdia = (preentr - 2.5) * 2;
        }

        else {
            preentrdia = preentr;
        }

        String entr;
        System.out.println("¿Tienes entrada de CineCampa?");
        entr = System.console().readLine();

        double pret = 0;
        if (entr.equals("si")){
            pret = preentrdia - ((preentrdia * 10)/100);   
        }

        else {
            pret = preentrdia;   
        }

        System.out.println("Tendras que pagar" + pret);

    }

}
