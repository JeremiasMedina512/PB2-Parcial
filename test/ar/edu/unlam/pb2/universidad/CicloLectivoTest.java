package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Test;

import ar.edu.unlam.pb2.universidad.Alumno;
import ar.edu.unlam.pb2.universidad.Universidad;

public class CicloLectivoTest {

	@Test
	public void queSePuedaCrearCicloLectivo() {
		Integer idCicloLectivo = 1;
		Date fechaInicioCicloLectivo = new Date ();
		Date fechaFinalizacionCicloLectivo = new Date();
		Date fechaInicioInscripcion = new Date();;
		Date fechaFinalizacionInscripcion = new Date();;
		Boolean resultadoEsperado = false;

		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaFinalizacionCicloLectivo,fechaInicioCicloLectivo, fechaInicioInscripcion, fechaFinalizacionInscripcion);
		Universidad unlam = new Universidad("Unlam");
		resultadoEsperado = unlam.crearCicloLectivo(cicloLectivo);

		assertTrue(resultadoEsperado);
	}
}
