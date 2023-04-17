
import java.util.*;

public class Ejercicio23 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce la base imponible");
        int base = Integer.parseInt(s.nextLine());

        String iva;
        System.out.println("Introduca el tipo de IVA 'General, reducido, superreducido'");
        iva = System.console().readLine();

        double totalsiniva = 0;

        if (iva.equals("reducido")){
           double redu;
           redu = base + ((base * 10)/100);
           totalsiniva = redu;
        }

        else if (iva.equals("superreducido")){
            double redd2;
            redd2 =  base + ((base * 4)/100);
            totalsiniva = redd2;
        }

        else if (iva.equals("general")){
            double ivge;
            ivge = base + ((base * 21)/100);
            totalsiniva = ivge;
        }

        String cpromo;
        System.out.println("Introduzca el código promocional");
        cpromo = System.console().readLine();

        double fina = 0;

        switch (cpromo){
            case "nopro":
            break;

            case "mitad":
            double mitad;
            mitad = totalsiniva / 2;
            fina = mitad;
            break;

            case "menor5":
            double menor5;
            menor5 = totalsiniva - 5;
            fina = menor5;
            break;

            case "5porc":
            double porc5;
            porc5 = totalsiniva + ((totalsiniva * 5)/100);
            fina = porc5;
            break;

        }

        System.out.println("Tienes que pagar" + fina);
    }
}
