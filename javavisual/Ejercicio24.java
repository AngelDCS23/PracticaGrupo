
import java.util.*;

public class Ejercicio24 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        String cargo;
        System.out.println("¿Cual es tu cargo?");
        cargo = System.console().readLine();

        String estado;
        System.out.println("¿Estado civil?");
        estado = System.console().readLine();

        System.out.println("¿Cuantos dias has estado trabajando visitando clientes?");
        int dia = Integer.parseInt(s.nextLine());


        int sueldo = 0;
        int suelb = 0;
        if (cargo.equals("junior")){
            sueldo = 950;
            suelb = sueldo;
        }
        else if (cargo.equals("senior")){
            sueldo = 1200;
            suelb = sueldo;
        }
        else if (cargo.equals("jefe")){
            sueldo = 1600;
            suelb = sueldo;
        }
        
       
        int suelt = 0;
        int sueldia;
        sueldia = suelt + (dia * 30);

        if (estado.equals("soltero")){
            suelt =  suelb - ((sueldo * 25)/100);
        }

        else if (estado.equals("cassado")){
            suelt = suelb - ((sueldo * 20)/100);
        }


        System.out.println("Tu sueldo total es de" + suelt);
    }
}
