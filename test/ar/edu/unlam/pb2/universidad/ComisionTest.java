package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class ComisionTest {

	@Test
	public void agregarComision() {
		Integer id = 1;
		Materia materia = new Materia();
		CicloLectivo cicloLectivo = new CicloLectivo(id, null, null, null, null);
		Boolean resultadoEsperado = false;
		Turno turno = null;
		
		Comision primeraComision = new Comision(id,materia,turno);
		Comision segundaComision = new Comision(id,materia,turno);
		Universidad unlam = new Universidad("Unlam");
//		
//		unlam.agregarComision(primeraComision);
//		resultadoEsperado = unlam.agregarComision(segundaComision);
				
		assertFalse(resultadoEsperado);

	}
	



}
