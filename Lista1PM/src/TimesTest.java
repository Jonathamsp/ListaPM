import static org.junit.Assert.*;

import org.junit.Test;

public class TimesTest {

	@Test
	public void testTimes() {
		final String RESULTADOS[][] ={{"Flamengo", "3",	"0",	"Volta	Redonda"},
				{"Volta Redonda",	"1",	"1",	"Botafogo"},
				{"Bonsucesso",	"5",	"0",	"Macaé"},
				{"Macaé",	"3",	"4",	"Fluminense"},
				{"Botafogo",	"2",	"2",	"Flamengo"}
		};
		Times times = new Times(RESULTADOS, 5);
		int pontosEsperados = times.quantidadePontos("Botafogo");
		assertEquals(2, pontosEsperados);
	}

}
