package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlacaTest {

    private Placa placa = new Placa();

<<<<<<< HEAD
    /*@Test
    public void listHasPlaca(){
        assertThat(placa.getPlacas(), hasItem("ABC1234"));
    }*/
=======
    @Test
    public void listHasPlaca(){
        assertThat(placa.getPlacas(), hasItem("ABC1234"));
    }
>>>>>>> 0c7ce685e043eed7ab70a9f393b863cf9d3a9c07

    @Test
    public void placaIsValid(){
        assertThat(placa.placaIsValid("ABC1234"), is(true));
    }

    @Test
    public void placaIsNotValid(){
<<<<<<< HEAD
        assertThat(placa.placaIsValid("ABC4321"), is(false));
=======
        assertThat(placa.placaIsValid("ABC1235"), is(false));
>>>>>>> 0c7ce685e043eed7ab70a9f393b863cf9d3a9c07
    }

    @Test
    public void getPlacaStatusActive() {
        assertThat(placa.getPlacaStatus("ABC1234"), is("Active"));
    }

    @Test
    public void getPlacaStatusInactive(){
        assertThat(placa.getPlacaStatus("ABC0000"), is("Inactive"));
    }
<<<<<<< HEAD
    
    @Test
    public void getTagActive() {
        assertThat(placa.getTagStatus("ABC1234"), is("123"));
    }

    @Test
    public void getTagStatusInactive(){
        assertThat(placa.getTagStatus("ABC0000"), is(""));
    }
=======
>>>>>>> 0c7ce685e043eed7ab70a9f393b863cf9d3a9c07
}
