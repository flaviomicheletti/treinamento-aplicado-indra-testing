package hello;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 0c7ce685e043eed7ab70a9f393b863cf9d3a9c07
import java.util.Arrays;
import java.util.List;

public class Placa {
<<<<<<< HEAD
	
    public Placa() {
    }
    
    List<Veiculo> veiculos = Arrays.asList(new Veiculo("ABC1234", "Active", "123"), new Veiculo("ABC0000", "Inactive", "") );

    /*public String getPlacas() {
    	String retorno = "";
        for(Veiculo v : veiculos) {
        	retorno += v.getPlaca();
        }
        return retorno;
    }*/

    public boolean placaIsValid(String placa){
    	
        for(Veiculo v : veiculos) {
        	if(v.getPlaca() == placa) {
        		return true;
        	}
        }
        return false;
    }

    public String getPlacaStatus(String placa) {
    	
    	for(Veiculo v :veiculos) {
    		if(v.getPlaca() == placa) {
    			return v.getHabilitado();
    		}
    	}
    	return "";
    }
    
    public String getTagStatus(String placa) {
    	
    	for(Veiculo v :veiculos) {
    		if(v.getPlaca() == placa) {
    			return v.getTag();
    		}
    	}
    	return "";
=======
    public Placa() {
    }

    private List<String> placas = Arrays.asList("ABC1234", "Active", "ABC0000", "Inactive");

    public List<String> getPlacas() {
        return placas;
    }

    public boolean placaIsValid(String placa){
        return placas.contains(placa);
    }

    public String getPlacaStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 1);
>>>>>>> 0c7ce685e043eed7ab70a9f393b863cf9d3a9c07
    }
}
