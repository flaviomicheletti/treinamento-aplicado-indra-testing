package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlacaTeste {

	Placa placa = new Placa();
	
	@Test
	public void ConferirPlacaHabilitada() {
		assertThat(placa.conferirPlaca(), is(true));
	}
	
	@Test
	public void ConferirPlacaDesabilitada() {
		assertThat(placa.conferirPlaca(), is(false));
	}
}
