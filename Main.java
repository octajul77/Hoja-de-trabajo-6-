import java.util.Scanner;
import java.util.Set;
/*
Hoja de trabajo No. 6
Julio Gonzalez 14096
Andre Hernandez ----
*/



public class main{
	public static void main(String[] args) {
		Set<String> javaD, webD, phoneD;
		Scanner teclado = new Scanner(System.in);
		String [] implementation = {"HashSet", "TreeSet", "LinkedHashSet"};
		String [] developer = {"Java Developer", "Web Developer", "Phone Developer"};
		
		System.out.println("Bienvenido al clasificador de personal de Desarrollo de Ambiente");
		/* Aca se trabaja ocn el factory */
		System.out.println("\n Seleccione la implementación de SET que desea utilizar.");
				for(int i=0; i<implementation.length; i++){
					System.out.println(+(i+1)+". "+implementation[i]);
					}
					
				int op = teclado.nextInt();
				Conjunto conjunto = new Conjunto(op);
				}
				}
