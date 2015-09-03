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
		
		System.out.println("\nIngreso Developers:\nEscriba 'end' para finalizar este proceso");
		while(true){
			try{
				//Conjunto conjunto = new Conjunto();
				System.out.println("\nIngrese el nombre de developers:\n");
				Scanner input = new Scanner(System.in);
				System.out.print("Nombre:  ");
				String nombre = input.nextLine();
				if(nombre.equals("end"))
					break;
				System.out.println("Tipo de developer\nSeleccione si/no si es parte del ambiente de desarrollo:");
				for(int i=0; i<developer.length; i++){
					System.out.print(developer[i]+": ");
					String grupo = input.nextLine();
					
					if(grupo.equals("si")){
						if(i==0)
							conjunto.agregar(nombre,(i+1));
						if(i==1)
							conjunto.agregar(nombre,(i+1));
						if(i==2)
							conjunto.agregar(nombre,(i+1));
					}
				}
			}
			catch(Exception e){

			}
		}
		// Inciso 1
		System.out.println("\nDesarrolladores con experiencia en Java, web y celulares.");
		for(int i=0; i<conjunto.javaAndWebAndCel(op).length; i++){
			System.out.println(conjunto.javaAndWebAndCel(op)[i]);
		}
		// Inciso 2
		System.out.println("\nDesarrolladores con experiencia en Java pero que no tengan experiencia en web.");
		for(int i=0; i<conjunto.javaNotWeb(op).length; i++){
			System.out.println(conjunto.javaNotWeb(op)[i]);
		}
		// Inciso 3
		System.out.println("\nDesarrolladores con experiencia en web y celulares, pero que no tengan experiencia en java");
		for(int i=0; i<conjunto.webAndCelNotJava(op).length; i++){
			System.out.println(conjunto.webAndCelNotJava(op)[i]);
		}
		// Inciso 4
		System.out.println("\nDesarrolladores con experiencia en web o celulares, pero que no tengan experiencia en java");
		for(int i=0; i<conjunto.webOrCelNotJava(op).length; i++){
			System.out.println(conjunto.webOrCelNotJava(op)[i]);
		}
		//Inciso 5
		System.out.println("\nEl conjunto de desarrolladores java es un subconjunto de desarrolladores web.");
		System.out.println(conjunto.JavaSubConjunto(op));
		
		//Inciso 6
		System.out.println("\nEl conjunto con la cantidad mas grande de desarrolladores y sus nombres");
		if (conjunto.MayorConjunto(op) !=null){
			for(int i=0; i<conjunto.MayorConjunto(op).length; i++){
				System.out.println(conjunto.MayorConjunto(op)[i]);
			}
		
		}else{
			System.out.println(" NO Hay mayor conjunto");
		}
		
		
		
	}
}
