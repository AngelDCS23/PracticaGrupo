
import java.util.*;

public class Ejercicio27 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        String sabor;
        System.out.println("¿De que sabor quiere la tarta?");
        sabor = System.console().readLine();

        double precio =0;

        if (sabor.equals("chocolate")){
            precio = 18;

            String tipo = "";
            switch (tipo){
                case "negro":
                precio = 14;        /*Tengo que cambiar el switch por los if y ya debería funcionar, creo. */
                break;

                case "blanco":
                precio = 15;
                break;
            }
        }
        else if (sabor.equals("fresa")){
            precio = 16;
        }
        else if (sabor.equals("manzana")){
            
        }

        String nata ="";
        double precion=0;

        if (nata.equals("si")){
            precion = precio + 2.5;
        }

        else if (nata.equals("no")){
            precion = precio + 0;
        }

        String nombre;
        double preciot =0;
        System.out.println("¿Quieres personalizarla con el nombre");
        nombre = System.console().readLine();

        if (nombre.equals("si")){
            preciot = precion + 2.75;
        }       
        else if (nombre.equals("no")){
            preciot = precion + 0;
        }
        
        System.out.println("La tarta te va a costar" + preciot);
        }
    }

