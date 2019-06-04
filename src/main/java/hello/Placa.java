package hello;

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

    private List<String> placas = Arrays.asList("ABC1234", "Active", "ABC0000", "Inactive");

    public List<String> getPlacas() {
        return this.placas;
    }

    public boolean placaIsValid(String placa){
        return this.placas.contains(placa);
    }

    public String getPlacaStatus(String placa) {
        return placas.get(placas.indexOf(placa) + 1);
    }
}
