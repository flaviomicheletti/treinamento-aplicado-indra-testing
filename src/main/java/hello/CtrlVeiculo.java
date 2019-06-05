package hello;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 0c7ce685e043eed7ab70a9f393b863cf9d3a9c07
import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD:src/main/java/hello/CtrlVeiculo.java
public class CtrlVeiculo {
=======
public class Placa {
<<<<<<< HEAD
>>>>>>> 04fd6ffba84a630ad6c401c1ed9e27708d0d3807:src/main/java/hello/Placa.java
	
    public CtrlVeiculo() {
    }
    
    List<Veiculo> veiculos = Arrays.asList(new Veiculo("ABC1234", "Active", "123"), new Veiculo("ABC0000", "Inactive", "") );

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
