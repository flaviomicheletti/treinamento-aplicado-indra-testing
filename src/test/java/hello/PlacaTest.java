package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlacaTest {

    private Placa placa = new Placa();

    @Test
    public void placaIsValid(){
        assertThat(placa.listaPlacas(), hasItem("ABC1234"));
    }
}
