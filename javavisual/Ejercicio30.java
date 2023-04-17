
import java.util.*;

public class Ejercicio30 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        String mes;
                System.out.println("Escribe un mes");
                mes = System.console().readLine();

                switch (mes){
                        
        case "enero":
        System.out.println("Enero tiene 31 dias");
        break;
        case "febrero":
        System.out.println("Febrero tiene 28 dias");
        break;
        case "marzo":
        System.out.println("Marzo tiene 31 dias");
        break;
        case "abril":
        System.out.println("Abril tiene 30 dias");
        break;
        case "mayo":
        System.out.println("mayo tiene 31 dias");
        break;
        case "junio":
        System.out.println("Junio tiene 30 dias");
        break;
        case "julio":
        System.out.println("Julio tiene 31 dias");
        break;
        case "agosto":
        System.out.println("Agosto tiene 31 dias");
        break;
        case "septiembre":
        System.out.println("Septiembre tiene 30 dias");
        break;
        case "octubre":
        System.out.println("Octubre tiene 31 dias");
        break;
        case "nomviembre":
        System.out.println("noviembre tiene 30 dias");
        break;
        case "diembre":
        System.out.println("Diciembre tiene 31 dias");
        break;
            
        }
    }
}
