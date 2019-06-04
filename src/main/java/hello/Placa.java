package hello;

import java.util.Arrays;
import java.util.List;

public class Placa {
	
	List<String> placas = Arrays.asList("ABC1234");
	
	public boolean consultarPlaca(String placa) {
		boolean retorno = false;
		
		for(String x : placas) {
			if(x == placa) {
				retorno = true;
			} 
		}
		return retorno;
	}
	
	public boolean conferirPlaca(String placa) {
		return true;
	}
	
	
}
