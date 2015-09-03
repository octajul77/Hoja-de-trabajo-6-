import java.util.Set;
public class Conjunto {
	//atributos
	private Set<String> JavaD, WebD, PhoneD;
	
	public Conjunto (int op){
		factory<String> factory = new factory<String>();
		JavaD = factory.getSet(op);
		WebD = factory.getSet(op);
		PhoneD = factory.getSet(op);
	}
	
	
	
	
	public void agregar(String nombre, int opcion){
		switch(opcion){
		case 1:
			JavaD.add(nombre);
			break;
		case 2:
			WebD.add(nombre);
			break;
		default:
			PhoneD.add(nombre);
		}
	}  
	
	public Object[] javaAndWebAndCel(int op){
		factory<String> factory = new factory<String>();
		Set java1 = factory.getSet(op);
		java1.addAll(JavaD);
		Set web1 = factory.getSet(op);
		web1.addAll(WebD);
		Set phone1 = factory.getSet(op);
		phone1.addAll(PhoneD);

		java1.retainAll(phone1);
		web1.retainAll(java1);
		Object [] arreglo1 = web1.toArray();
		
		return arreglo1;
	
	}
	
	public Object[] javaNotWeb(int op){
		factory<String> factory = new factory<String>();
		Set java2 = factory.getSet(op);
		java2.addAll(JavaD);
		Set web2 = factory.getSet(op);
		web2.addAll(WebD);
		Set phone2 = factory.getSet(op);
		
		web2.addAll(WebD);
		java2.addAll(JavaD);
		java2.removeAll(web2);
		Object [] arreglo2 = java2.toArray();
		
		return arreglo2;
	}
	public Object[]  webAndCelNotJava(int op){
		factory<String> factory = new factory<String>();
		Set java3 = factory.getSet(op);
		java3.addAll(JavaD);
		Set web3 = factory.getSet(op);
		web3.addAll(WebD);
		Set phone3 = factory.getSet(op);
	
		web3.addAll(WebD);
		java3.addAll(JavaD);
		phone3.addAll(PhoneD);		
		web3.retainAll(phone3);
		web3.removeAll(java3);
		Object [] arreglo3 = web3.toArray();
	
		return arreglo3;
	}
	
	public Object[] webOrCelNotJava(int op){
		factory<String> factory = new factory<String>();
		Set java4 = factory.getSet(op);
		java4.addAll(JavaD);
		Set web4 = factory.getSet(op);
		web4.addAll(WebD);
		Set phone4 = factory.getSet(op);
		
		web4.addAll(WebD);
		java4.addAll(JavaD);
		phone4.addAll(PhoneD);	
		web4.addAll(phone4);
		web4.removeAll(java4);
		Object [] arreglo4 = web4.toArray();
		
		return arreglo4;
		
		}
	public String JavaSubConjunto(int op){
		factory<String> factory = new factory<String>();
		Set java5 = factory.getSet(op);
		java5.addAll(JavaD);
		Set web5 = factory.getSet(op);
		web5.addAll(WebD);
		Set phone5 = factory.getSet(op);
		
		web5.addAll(WebD);
		java5.addAll(JavaD);
		phone5.addAll(PhoneD);	
		if(WebD.containsAll(JavaD)){
		  return "SI";
		}else{
		return "NO";
		}
		}
		
	public Object[] MayorConjunto(int op){
		factory<String> factory = new factory<String>();
		Set java6 = factory.getSet(op);
		java6.addAll(JavaD);
		Set web6 = factory.getSet(op);
		web6.addAll(WebD);
		Set phone6 = factory.getSet(op);
		
		Set mayor = factory.getSet(op);
		web6.addAll(WebD);
		java6.addAll(JavaD);
		phone6.addAll(PhoneD);	
		
		if(java6.size()>web6.size() && java6.size()>phone6.size())
			mayor.addAll(java6);
		if(web6.size()>java6.size() && web6.size()>phone6.size())
			mayor.addAll(web6);
		if(phone6.size()>java6.size() && phone6.size()>web6.size())
			mayor.addAll(phone6);
		if(!mayor.isEmpty()){
			Object [] arreglo5 = mayor.toArray();
			return arreglo5;
		
		}
		else {
		return null;
		}
	
	}	
			
	
	
	}
