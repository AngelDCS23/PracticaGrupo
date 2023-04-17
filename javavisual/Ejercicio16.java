
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String [] args){

        Scanner s = new Scanner (System.in);

        System.out.println("tendras una serie de preguntar a continuación, respondo con un '1' si es afirmativo y con un '2' si es negativo");

    System.out.println("¿Tú pareja esá más inquiete de lo normal sin motivo aparente?");
        int a = Integer.parseInt(s.nextLine());

    System.out.println("¿Ha aumentado sus gastos en vestuario?");
        int b= Integer.parseInt(s.nextLine());

    System.out.println("¿Ha perdido el interes que mostraba anteriormente por ti?");
        int c = Integer.parseInt(s.nextLine());

    System.out.println("¿Se arregla más?");
        int d = Integer.parseInt(s.nextLine());

    System.out.println("No te deja mirar su agenda del móvil?");
        int e = Integer.parseInt(s.nextLine());

    System.out.println("¿No contestas ciertas llamadas en tu preséncia?");
        int f = Integer.parseInt(s.nextLine());

    System.out.println("¿Se cuida más que antes?");
        int g = Integer.parseInt(s.nextLine());

    System.out.println("¿Viene tarde del trabajo?");
        int h = Integer.parseInt(s.nextLine());

    System.out.println("¿Usa más perfume?");
        int i = Integer.parseInt(s.nextLine());

    System.out.println("¿se confunde en sitio que dice ir contigo?");
        int j = Integer.parseInt(s.nextLine());
        
        int sum = 1;
        int x;
        int y = 1;

        
        if ( a == 1 ){
            x = sum + 3;

        }

        else if (a == 2){
            x = sum + 0;
        }
        if ( b == 1 ){
            x = sum + 3;

        }

        else if (b == 2){
            x = sum + 0;
        }
        if ( c == 1 ){
            x = sum + 3;

        }

        else if (c == 2){
            x = sum + 0;
        }
        if ( d == 1 ){
            x = sum + 3;

        }

        else if (d == 2){
            x = sum + 0;
        }
        if ( e == 1 ){
            x = sum + 3;

        }

        else if (e == 2){
            x = sum + 0;
        }
        if ( f == 1 ){
            x = sum + 3;

        }

        else if (f == 2){
            x = sum + 0;
        }
        if ( g == 1 ){
            x = sum + 3;

        }

        else if (g == 2){
            x = sum + 0;
        }
        if ( h == 1 ){
            x = sum + 3;

        }

        else if (h == 2){
            x = sum + 0;
        }
        if ( i == 1 ){
            x = sum + 3;

        }

        else if (i == 2){
            x = sum + 0;
        }
        if ( j == 1 ){
            x = sum + 3;

        }

        else if (j == 2){
            x = sum + 0;
            y = sum - 2;
        }

        if (y <= 10){
            System.out.println("Enhorabuena, tu pareja es fiel" + y);
        }

        else if (y ==11 && y <= 22){
            System.out.println("Quizas esté en peligro tu relación, o solo seas un maniatico inseguro");
        }

        else if (y == 22 && y <=30){
            System.out.println("Enhorabuena, puede que tu mareja sea infiel, que ademas seria bastante normal, te has puesto a pregramar en java para intentar saber si te es fiel o no...Espero que no lo sea");

        }

    }
}
