package hello;

import java.util.Arrays;
import java.util.List;

public class Placa {
	
    public Placa() {
    }

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
    }
}
