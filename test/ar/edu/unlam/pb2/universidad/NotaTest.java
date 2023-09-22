package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class NotaTest {

	@Test
	public void crearNota() {
		Universidad unlam = new Universidad("unlam");
		Integer valorNota = 1;
		Nota nota = new Nota(valorNota);
		Boolean resultadoEsperado = false;
		
		resultadoEsperado =unlam.registrarNota(nota);
		
		assertTrue(resultadoEsperado);
	}
	
	@Test //INCOMPLETO
	public void queElValorDeLaNotaSeaEntreUnoYDiez() {
		Universidad unlam = new Universidad("unlam");
		Integer primerValor = 0;
		Integer segundoValor = 11;
		Integer idCurso;
		Integer idAlumno;
		
		Nota primeraNota = new Nota(primerValor);
		Nota segundaNota = new Nota(segundoValor);
		Boolean primerResultadoEsperado = false;
		Boolean segundoResultadoEsperado = false;

		primerResultadoEsperado =unlam.registrarNota(primeraNota);
		segundoResultadoEsperado = unlam.registrarNota(segundaNota);
		
		assertFalse(primerResultadoEsperado);
		assertFalse(segundoResultadoEsperado);
	}

}
