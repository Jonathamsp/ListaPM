import static org.junit.Assert.*;

import org.junit.Test;

public class MediaTest {

	@Test
	public void testMedia() {
		Media test = new Media(7.0, 4.0);
		String esperada = "aluno na final";
		String resultado = (test.notasAluno(6.0, 7.4, 8.2, 1.2));
		assertEquals(esperada, resultado);
	}
}
