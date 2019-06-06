package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ViagemTest {

	private Viagem viagem = new Viagem();
	
	@Test 
	 public void testViagemFinalizada() {
		assertThat(viagem.finalizarViagem(), containsString("ok!"));
	}
	
	@Test
	public void testeViagemCancelada() {
		assertThat(viagem.cancelarViagem(), containsString("Viagem Cancelada antes do início."));
	}
}
