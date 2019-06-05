package hello;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class VPTest {

    Veiculo veiculo = new Veiculo ();
    
    @Test
    public void testePlacaIsValid () {
    	assertThat(veiculo.placaIsValid("abc123"), is (false));
    }
    
    @Test
    public void testeStatusPlaca () {
    	assertThat(veiculo.statusPlaca(),containsString("Placa Desabilitada") );
    }
    
    @Test
    public void testeTagIsValid () {
    	assertThat (veiculo.tagIsValid("tag1"),is (false));
    }
    
    @Test
    public void testeTagStatus () {
    	assertThat (veiculo.statusTag(),containsString("ok"));
    }
}

   

  
  

   