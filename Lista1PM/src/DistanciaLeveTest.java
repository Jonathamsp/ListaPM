import static org.junit.Assert.*;

import org.junit.Test;

public class DistanciaLeveTest {

	@Test
	public void testDistanciaLeve() {
		int esperado = 3;
		int obtido = DistanciaLeve.calculaDistancia("kitten", "sitting");
		assertEquals(esperado, obtido);
	}

}
