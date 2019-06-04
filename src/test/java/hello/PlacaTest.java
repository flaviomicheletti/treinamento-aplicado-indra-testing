package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlacaTest {

    private Placa placa = new Placa();

    @Test
    public void listHasPlaca(){
        assertThat(placa.getPlacas(), hasItem("ABC1234"));
    }

    @Test
    public void placaIsValid(){
        assertThat(placa.placaIsValid("ABC1234"), is(true));
    }

    @Test
    public void placaIsNotValid(){
        assertThat(placa.placaIsValid("ABC1235"), is(false));
    }
}
