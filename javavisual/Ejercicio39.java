import java.util.*;

public class Ejercicio39 {
    public static void main(String []args){

        Scanner s = new Scanner (System.in);

        System.out.println("Introduce tu sueldo");
        int suel = Integer.parseInt(s.nextLine());

        System.out.println("Introduce tu antigüedad");
        int ant = Integer.parseInt(s.nextLine());

        int aum;
        if (suel < 500 && ant >= 10){
            aum = suel + ((suel * 20)/100);
            System.out.println("Tu sueldo es de " + aum);
        }

        else if (suel < 500 && ant < 10){
            aum = suel + ((suel *5)/100);
            System.out.println("Tu sueldo es de " + aum);
        }

        else if (suel >= 500){
            System.out.println("Tu sueldo es de " + suel);
        }

    }
}