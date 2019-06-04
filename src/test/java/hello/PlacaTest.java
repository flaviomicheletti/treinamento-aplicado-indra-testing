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

    @Test
    public void getPlacaStatusActive() {
        assertThat(placa.getPlacaStatus("ABC1234"), is("Active"));
    }

    @Test
    public void getPlacaStatusInactive(){
        assertThat(placa.getPlacaStatus("ABC0000"), is("Inactive"));
    }
    
    @Test
    public void getTagStatusActive() {
        assertThat(placa.getTagStatus("ABC1234"), is("Active"));
    }

    @Test
    public void getTagStatusInactive(){
        assertThat(placa.getTagStatus("ABC0000"), is("Inactive"));
    }
}
