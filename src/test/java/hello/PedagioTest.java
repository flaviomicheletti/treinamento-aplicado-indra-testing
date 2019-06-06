package hello;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PedagioTest {
	
	Pedagio pedagio = new Pedagio();
	
	@Test
    public void placaIsValid(){
        assertThat(pedagio.getValorPassagem("p2"), is(12.00));
    }
}
