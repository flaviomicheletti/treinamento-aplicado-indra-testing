package hello;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0
import java.util.Arrays;
import java.util.List;

public class Placa {
	
    public Placa() {
    }
<<<<<<< HEAD

    private List<String> placas = Arrays.asList("ABC1234", "Active", "ABC0000", "Inactive");
    
    private List <String> tag = Arrays.asList("tag123", "tag456", "tag789");

    public List<String> getPlacas() {
        return placas;
    }

    public boolean placaIsValid(String placa){
        return placas.contains(placa);
    }

    public String getPlacaStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 1);
    }
    
    public boolean tagIsValid (String tag) {
    	
    	return tag.contains(tag);
=======
    
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
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0
    }
}
