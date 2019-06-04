package hello;

import java.util.ArrayList;

public class Placa {
	
	
	public boolean conferirPlaca(String placa) {
		
		ArrayList<String> placas = new ArrayList();
		
		placas.add("ABC1234");
		
		boolean retorno = false;
		
		for(String x : placas) {
			if(x == placa) {
				retorno = true;
			} 
		}
		
		return retorno;
		
	}
}
