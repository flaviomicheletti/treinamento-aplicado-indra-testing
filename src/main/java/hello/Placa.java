package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONObject;

public class Placa {

    private List<JSONObject> listaPlacas = Arrays.asList();

    public Placa() {
        JSONObject placa = new JSONObject();
        placa.put("placa", "ABC1234");
        placa.put("status", "Active");
        JSONObject placa2 = new JSONObject();
        placa.put("placa", "ABC0000");
        placa.put("status", "Inactive");
        this.listaPlacas.add(placa);
    }
    
    List<Veiculo> veiculos = Arrays.asList(new Veiculo("ABC1234", "Active", "123"), new Veiculo("ABC0000", "Inactive", "") );

<<<<<<< HEAD
    private List<String> placas = Arrays.asList("ABC1234", "Active", "ABC0000", "Inactive");

    public List<String> getPlacas() {
        return this.placas;
    }

    public boolean placaIsValid(String placa){
        return this.placas.contains(placa);
=======
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
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0
    }

    public String getPlacaStatus(String placa) {
    	
    	for(Veiculo v :veiculos) {
    		if(v.getPlaca() == placa) {
    			return v.getHabilitado();
    		}
    	}
    	return "";
    }
<<<<<<< HEAD
=======
    
    public String getTagStatus(String placa) {
    	
    	for(Veiculo v :veiculos) {
    		if(v.getPlaca() == placa) {
    			return v.getTag();
    		}
    	}
    	return "";
    }
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0
}
