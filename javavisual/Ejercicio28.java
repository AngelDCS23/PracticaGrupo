
import java.util.*;

public class Ejercicio28 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        

        String mov1;
        System.out.println("jugador 1, ¿Que movimiento quieres realizar?");
        mov1 = System.console().readLine();

        String mov2;
        System.out.println("Jugador 2, ¿Que movimient quieres realiuzar?");
        mov2 = System.console().readLine();

        if (mov1.equals("piedra") && mov2.equals("tijeras") || mov1.equals("papel") && mov2.equals("piedra") || mov1.equals("tijeras") && mov2.equals("papel")){
            System.out.println("Gana el jugador 1");
        }
        else if (mov2.equals("piedra") && mov1.equals("tijeras") || mov2.equals("papel") && mov1.equals("piedra") || mov2.equals("tijeras") && mov1.equals("papel") ){
            System.out.println("Gana el jugador 2");
        }
        else if (mov1.equals("piedra") && mov2.equals("piedra") || mov1.equals("papel") && mov2.equals("papel") || mov1.equals("tijeras") && mov2.equals("tijeras")){
            System.out.println("Empate");
        }
    }
}