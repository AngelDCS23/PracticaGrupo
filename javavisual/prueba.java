
import java.util.Scanner;

/* Ejemplo 2 (Comprobador de edades)
 * 
 * 
 */
 
 public class prueba {
	 public static void main(String [] args){
		 
	 Scanner s = new Scanner (System.in);
	 
	 System.out.println("Introduce tu edad");
	 int edad = Integer.parseInt(s.nextLine());
	 
	 if (edad >= 18){
		 System.out.println("Mayor de edad");
	 }
	 
	 else {
		 System.out.println("Es menor de edad");
	 }
	 
 }
}
