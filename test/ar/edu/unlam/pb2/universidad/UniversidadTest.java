package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import ar.edu.unlam.pb2.universidad.Materia;
import ar.edu.unlam.pb2.universidad.Universidad;

public class UniversidadTest {

	@Test
	public void queSePuedaCrearUniversidad() {
		Universidad unlam = new Universidad("Unlam");
		
		assertNotNull(unlam);
	}



	
	
}
