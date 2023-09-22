package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class DocenteTest {

	
	@Test
	public void queNoExistanDosDocentesConElMismoDni() {
		Universidad unlam = new Universidad("unlam");
		Integer dniDocente = 1;
		Boolean resultadoEsperado = false;
		
		Docente primerDocente= new Docente(dniDocente);
		Docente segundoDocente = new Docente(dniDocente);
		
		unlam.agregarDocente(primerDocente);
		resultadoEsperado = unlam.agregarDocente(segundoDocente);
		
		assertFalse(resultadoEsperado);
		
	}
	
	@Test
	public void asignarDocentesAComision() {
		Universidad unlam = new Universidad("unlam");
		Integer dniDocente = 1;
		Boolean resultadoEsperado = false;
		
		Docente primerDocente= new Docente(dniDocente);
		
		unlam.agregarDocente(primerDocente);
		resultadoEsperado = unlam.agregarDocente(primerDocente);
		
		assertFalse(resultadoEsperado);
		
	}
	
	

}
