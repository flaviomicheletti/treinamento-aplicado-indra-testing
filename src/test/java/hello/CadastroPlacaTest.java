package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class CadastroPlacaTest {
	
	CadastroPlaca cp = new CadastroPlaca();
	
	@Test
	public void cpGetCadastroPlaca () {
		assertThat(cp.getPlaca(), containsString("abc1234"));
	}

}
