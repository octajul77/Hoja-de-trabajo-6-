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
	}
	
