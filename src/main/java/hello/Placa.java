package hello;

import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD
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

    private List<String> placas = Arrays.asList("ABC1234", "Active", "ABC0000", "Inactive");

    public List<String> getPlacas() {
        return this.placas;
    }

    public boolean placaIsValid(String placa){
        return this.placas.contains(placa);
=======

public class Placa {
	
    public Placa() {
    }

    private List<String> placas = Arrays.asList("ABC1234", "Active", "Active", "ABC0000", "Inactive", "Inactive");

    public List<String> getPlacas() {
        return placas;
    }

    public boolean placaIsValid(String placa){
        return placas.contains(placa);
>>>>>>> 6fd0e7056237aca40f9d41c1971213e734339339
    }

    public String getPlacaStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 1);
    }
<<<<<<< HEAD
=======
    
    public String getTagStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 2);
    }
>>>>>>> 6fd0e7056237aca40f9d41c1971213e734339339
}
