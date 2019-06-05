package hello;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TagTest {

	CtrlTag tag = new CtrlTag();
	
	@Test
	public void validaTagHabilitada() {
		assertThat(tag.validaTag("1234"),is(true));

	}
	
	@Test
	public void validaTagDesabilitada() {
		assertThat(tag.validaTag("4321"),is(false));

	}

	
	@Test
	public void validaSaldoPositivo() {
		assertThat(tag.validaSaldo("1234"),is(true));
	}
	
	@Test
	public void validaSaldoNegativo() {
		assertThat(tag.validaSaldo("4568"),is(false));
	}
	
	@Test
	public void validaSaldoAtualizado() {
		assertThat(tag.validaSaldoAtualizado("1234", 100),is(100));
	}
}
