package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class ComisionTest {

	@Test
	public void agregarComision() {
		Integer id = 1;
		Materia materia = new Materia();
		CicloLectivo cicloLectivo = new CicloLectivo();
		Turno turno = new Turno();
		Boolean resultadoEsperado = false;
		
		Comision primeraComision = new Comision(id,materia,cicloLectivo,turno);
		Comision segundaComision = new Comision(id,materia,cicloLectivo,turno);
		Universidad unlam = new Universidad("Unlam");
		
		unlam.agregarComision(primeraComision);
		resultadoEsperado = unlam.agregarComision(segundaComision);
				
		assertFalse(resultadoEsperado);

	}
	



}
