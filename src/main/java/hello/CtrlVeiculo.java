package hello;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CtrlVeiculo {
	
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
    }
}


