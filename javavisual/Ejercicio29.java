
import java.util.*;

public class Ejercicio29 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);

        String comida;
        System.out.println("¿Que has comido");
        comida = System.console().readLine();

        double preciob= 0;  /*sumar luego */
        switch (comida){
            case "palmera":
            preciob = 1.40;
            break;

            case "donut":
            preciob = 1;
            break;

            case "pitufo":
            preciob = 1.20;
            break;
        }
            double preciocon = 0; /*sumar luego */
            if (comida.equals("pitufo")){
                String cond;
                System.out.println("¿Que era con acéite o con tortilla?");
                cond = System.console().readLine();

                 
                    if (cond.equals("aceite")){
                        preciocon = 1.20;
                    }
                    else if (cond.equals("tortilla")){
                        preciocon = 1.60;
                    }
            }

            String bebida;
            System.out.println("¿Que bebida quieres tomar");
            bebida = System.console().readLine();

            double preciobebi = 0; /*sumar luego */
            if (bebida.equals("zumo")){
                preciobebi = 1.50;
            }
            else if (bebida.equals("cafe")){
                preciobebi = 1.20;
            }

            double preciototal;

            preciototal = preciob + preciocon + preciobebi;

            System.out.println("ELprecio total del desayuno es de " + preciototal);
    }
}
