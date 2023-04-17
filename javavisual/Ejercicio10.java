
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner s = new Scanner (System.in);

        String horos = "";

        System.out.println("Dime el mes que naciste con números");
        int mes = Integer.parseInt(s.nextLine());

        System.out.println("Dime el dia que naciste");
        int dia = Integer.parseInt(s.nextLine());

        switch (mes){
            case 1: /*Acuario*/
                if (dia < 21){
                    System.out.println("Eres Capricornio");
                }
                else{
                    System.out.println("Eres Acuario");
                }
            break;
            
            case 2: /*Piscis*/
                if (dia < 20){
                    System.out.println("Eres Acuario");
                }
                else {
                    System.out.println("Eres Piscis");
                }
            break;

            case 3: /*Aries*/
                if (dia < 21){
                    System.out.println("Eres Piscis");
                }
                else {
                    System.out.println("Eres Aries");
                }
            break;

            case 4: /*Tauro*/
                if (dia < 21){
                    System.out.println("Eres Aries");
                }
                else {
                    System.out.println("Eres Tauro");
                }
            break;

            case 5: /*Géminis*/
                if (dia < 22){
                    System.out.println("Eres Tauro");
                }
                else {
                    System.out.println("Eres Géminis");
                }
            break;

            case 6: /*cáncer*/
                if (dia < 22){
                    System.out.println("Eres Géminis");
                }
                else {
                    System.out.println("Eres Cáncer");
                }
            break;

            case 7: /*Leo*/
                if (dia < 23){
                    System.out.println("Eres Cáncer");
                }
                else {
                    System.out.println("Eres Leo");
                }
            break;

            case 8: /*Virgo*/
                if (dia < 24){
                    System.out.println("Eres Leo");
                }
                else {
                    System.out.println("Eres Virgo");
                }
            break;
            
            case 9: /*Libra*/
                if (dia < 24){
                    System.out.println("Eres Virgo");
                }
                else {
                    System.out.println("Eres Libra");
                } 
            break;
            
            case 10: /*Escorpio*/
                if (dia < 24){
                    System.out.println("Eres Libra");
                }
                else {
                    System.out.println("Eres Escorpio");
                }
            break;
            
            case 11: /*Sagitario*/
                if (dia < 23){
                    System.out.println("Eres Escorpi");
                }
                else {
                    System.out.println("Eres Sagitario");
                }
            break;
            
            case 12: /*Capricornio*/
                if (dia < 22){
                    System.out.println("Eres Sagitario");
                }
                else {
                    System.out.println("Eres Capricornio");
                }
            break;
        }   
    }
}
