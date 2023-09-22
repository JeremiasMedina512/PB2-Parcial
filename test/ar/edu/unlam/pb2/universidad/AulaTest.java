package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class AulaTest {

	@Test
	public void crearAula() {
		Universidad unlam = new Universidad("unlam");
		Integer idAula = 1;
		Integer cantidadDeAlumnosAula= 1;
		Boolean resultadoEsperado = false;
		
		Aula aula = new Aula(idAula, cantidadDeAlumnosAula);
		
		resultadoEsperado =unlam.crearAula(aula);
		
		assertTrue(resultadoEsperado);
	}

}
