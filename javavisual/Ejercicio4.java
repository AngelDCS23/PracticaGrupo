
import java.util.Scanner;

/*Ejericio4 (Calcular salario dependiendo de las horas trabajadas, con la variable de que a partir de las 40 horas, el importe recibido por ahora es diferente) 
 * 
 * 
*/

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        int hora;
        int sueldo=0;
        int hora12;
        int hora16;
        
        System. out.println("Cuantas horas has trabajado esta semana");
        hora=Integer.parseInt(s.nextLine());

        if (hora <= 40){
            sueldo=(hora * 12);
        }

        else if (hora > 40){
        
            hora16 = (hora-40);
            hora12= (40 * 12);
            sueldo = (hora12 + (hora16 * 16));
        }

        System.out.println("Esta semana te corresponde " + sueldo);
    }
}
