import java.util.Set;
public class Conjunto {
	//atributos
	private Set<String> JavaD, WebD, PhoneD;
	private factory<String> factory = new factory<String>();
	
	public Conjunto (int op){
		JavaD = factory.getSet(op);
		WebD = factory.getSet(op);
		PhoneD = factory.getSet(op);
	}
	
	public void agregar(String nombre, int opcion){
		if (opcion==1) 
			JavaD.add(nombre);
		else if (opcion==2)
			WebD.add(nombre);
		else
			PhoneD.add(nombre);
	}  
	
	public Object[] javaAndWebAndCel(int op){
		Set<String> temp = factory.getSet(op);
		temp.addAll(JavaD);
		temp.retainAll(WebD);
		temp.retainAll(PhoneD);
		return temp.toArray();
	}
	
	public Object[] javaNotWeb(int op){
		Set<String> web2 = factory.getSet(op);
		web2.addAll(WebD);	
		web2.addAll(JavaD);
		web2.removeAll(WebD);
		return web2.toArray();
	}
	
	public Object[]  webAndCelNotJava(int op){
		Set<String> temp = factory.getSet(op);
		temp.addAll(WebD);
		temp.retainAll(PhoneD);
		temp.removeAll(JavaD);
		return temp.toArray();
	}
	
	public Object[] webOrCelNotJava(int op){
		Set<String> temp = factory.getSet(op);
		temp.addAll(WebD);
		temp.addAll(PhoneD);
		temp.removeAll(JavaD);		
		return temp.toArray();
		
		}
	public String JavaSubConjunto(int op){
		Set<String> temp1 = factory.getSet(op);
		Set<String> temp2 = factory.getSet(op);
		temp1.addAll(WebD);
		temp2.addAll(JavaD);
		temp1.retainAll(JavaD);
		if(temp2.size()==temp1.size())
			return "SI";
		else
			return "NO";
		}
		
	public Object[] MayorConjunto(){
		int a = JavaD.size();
		int b = WebD.size();
		int c = PhoneD.size();
		//Se utiliza la variable temp para crear un TreeSet que ya de por si ordena los nombres
		Set<String> temp = factory.getSet(3); 
		if(a>b && a>c)
			temp.addAll(JavaD);
		else if(b>a && b>c) 
			temp.addAll(WebD);
		else if(c>a && c>b) 
			temp.addAll(PhoneD);
		if (!temp.isEmpty())
			return temp.toArray();
		else 
			return null;	
	}	
}