package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CadastroPlacaTest {
	
	CadastroPlaca cp = new CadastroPlaca();
	
	@Test
	public void cpGetCadastroPlaca () {
		assertThat(cp.getPlaca(), containsString("abc1234"));
	}

	@Test
	
		public void cpValidarPlaca () {
		assertThat(cp.validarPlaca(), is(true));
	}
	
	@Test
	
	public void cpStatusPlaca () {
		assertThat(cp.statusPlaca(), containsString ("ativo"));
	}
}
