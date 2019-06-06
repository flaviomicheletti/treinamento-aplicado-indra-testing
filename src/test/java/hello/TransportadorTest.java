package hello;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class TransportadorTest {

    Transportador transportador = new Transportador();
    Veiculo veiculo = new Veiculo("ABC1234", "Active", "0000");

    @Test
    public void getVeiculoByPlaca() {
        assertThat(transportador.getVeiculoByPlaca("ABC1234"), samePropertyValuesAs(veiculo));
    }
}