
import java.util.Scanner;



public class Ejercicio12{
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);
        String a, b, c, d, e, f, g, h, i, j;

        System.out.println("¿Java tiene sentido?");
        a = System.console().readLine();

        System.out.println("¿Crees que java es divertido?");
        b = System.console().readLine();

        System.out.println("¿Html es un lenguaje de programación?");
        c = System.console().readLine();

        System.out.println("¿Java es un lenguaje horrible?");
        d = System.console().readLine();

        System.out.println("¿El que invento java tenia depresión?");
        e = System.console().readLine();

        System.out.println("¿El inventor de java tenia amigos?");
        f = System.console().readLine();

        System.out.println("¿Java tendría que dejar de existir?");
        g = System.console().readLine();

        System.out.println("¿Java es tan aburrido que ni sus desarrolladores lo utilizaban?");
        h = System.console().readLine();

        System.out.println("¿Crees en la supremacia de java?");
        i = System.console().readLine();

        System.out.println("¿java es un lenguaje util?");
        j = System.console().readLine();

        int suma = 0;
        int x = 0;

        if (a == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }

        if (b == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (c == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (d == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (e == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (f == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (g == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (h == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (i == "si"){
         suma = x + 1;
        }

        else {
            suma = x + 0;
        }
        if (j == "si"){
            suma = x + 1;
        }

        else {
            suma = x + 0;
        }


        System.out.println("El número total de aciertos es " + x);

    }
}