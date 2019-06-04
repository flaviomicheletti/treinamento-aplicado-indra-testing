package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlacaTest {

    private Placa placa = new Placa();

<<<<<<< HEAD
    @Test
    public void listHasPlaca(){
        assertThat(placa.getPlacas(), hasItem("ABC1234"));
    }
=======
    /*@Test
    public void listHasPlaca(){
        assertThat(placa.getPlacas(), hasItem("ABC1234"));
    }*/
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0

    @Test
    public void placaIsValid(){
        assertThat(placa.placaIsValid("ABC1234"), is(true));
    }

    @Test
    public void placaIsNotValid(){
<<<<<<< HEAD
        assertThat(placa.placaIsValid("ABC1235"), is(false));
=======
        assertThat(placa.placaIsValid("ABC4321"), is(false));
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0
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
<<<<<<< HEAD
    public void tagIsvalid() {
    	assertThat(placa.tagIsValid("tag123"),is (true));
=======
    public void getTagActive() {
        assertThat(placa.getTagStatus("ABC1234"), is("123"));
    }

    @Test
    public void getTagStatusInactive(){
        assertThat(placa.getTagStatus("ABC0000"), is(""));
>>>>>>> 9866cd89d52f29ad98ab91c9af260a1ff8e7f3d0
    }
}
