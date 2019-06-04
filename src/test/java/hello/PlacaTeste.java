package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PlacaTeste {

	Placa placa = new Placa();
	
	public void ConsultarPlacaExiste() {
		assertThat(placa.consultarPlaca("ABC1234"), is(true));
	}
	
	public void ConsultarPlacaNãoExiste() {
		assertThat(placa.consultarPlaca("CBA4321"), is(false));
	}
	
	@Test
	public void ConferirPlacaHabilitada() {
		assertThat(placa.conferirPlaca("ABC1234"), is(true));
	}
	
	@Test
	public void ConferirPlacaDesabilitada() {
		assertThat(placa.conferirPlaca("CBA4321"), is(false));
	}
}
