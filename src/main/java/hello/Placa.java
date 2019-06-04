package hello;

import java.util.Arrays;
import java.util.List;

public class Placa {
	
    public Placa() {
    }

    private List<String> placas = Arrays.asList("ABC1234", "Active", "Active", "ABC0000", "Inactive", "Inactive");

    public List<String> getPlacas() {
        return placas;
    }

    public boolean placaIsValid(String placa){
        return placas.contains(placa);
    }

    public String getPlacaStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 1);
    }
    
    public String getTagStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 2);
    }
}
