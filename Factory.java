import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
/*
Hoja de trabajo No. 6
Julio Gonzalez 14096
Andre Hernandez ----
*/




public class factory<E>{
	public Set<E> getSet(int num){
		if(num==1)
			return new LinkedHashSet<E>();
		if(num==2)
			return new HashSet<E>();
		if(num==3)
			return new TreeSet<E>();
				
			
		return null;
	}
}
