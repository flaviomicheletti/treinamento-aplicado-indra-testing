package hello;

import java.util.Arrays;
import java.util.List;

public class Placa {
    public Placa() {
    }

    List<String> placas = Arrays.asList("ABC1234", "ABC1236");

    public boolean placaIsValid(String placa){
        if (placas.contains(placa)){
            return true;
        }else{
            return false;
        }
    }

    public List<String> getPlacas() {
        return placas;
    }
}
