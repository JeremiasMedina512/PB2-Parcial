package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;


public class CicloLectivoTest {

	@Test
	public void queSePuedaCrearCicloLectivo() {
		Integer idCicloLectivo = 1;
		LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 8, 14);
		LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 12, 1);
		LocalDate fechaInicioInscripcion = LocalDate.of(2023, 8, 2);
		LocalDate fechaFinalizacionInscripcion = LocalDate.of(2023, 8, 4);
		Boolean resultadoEsperado = false;
		Boolean resultadoEsperadoCopia = false;

		Universidad unlam = new Universidad("Unlam");
		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);
		fechaInicioCicloLectivo = LocalDate.of(2021, 8, 14);
		CicloLectivo cicloLectivoCopia = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);
		resultadoEsperado = unlam.agregarCicloLectivo(cicloLectivo);
		resultadoEsperadoCopia = unlam.agregarCicloLectivo(cicloLectivoCopia);

		assertTrue(resultadoEsperado);
		assertFalse(resultadoEsperadoCopia);
	}

	@Test
	public void queNoSePuedanSuperponerLosCiclosLectivos() {
		Integer idCicloLectivo = 1;
		LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 3, 14);
		LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 7, 14);
		LocalDate fechaInicioInscripcion = LocalDate.of(2023, 12, 31);
		LocalDate fechaFinalizacionInscripcion = LocalDate.of(2023, 8, 4);
		Boolean resultadoEsperadoFechasSuperpuestas = false;
		Boolean resultadoEsperado = false;
		

		Universidad unlam = new Universidad("Unlam");
		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);
		
		idCicloLectivo= 2;
		LocalDate nuevaFechaInicioCicloLectivo = LocalDate.of(2023, 7, 14);
		LocalDate nuevaFechaFinalizacionCicloLectivo = LocalDate.of(2023, 12, 14);

		CicloLectivo cicloLectivoConFechaSuperpuesta = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, nuevaFechaInicioCicloLectivo, nuevaFechaFinalizacionCicloLectivo);
		
		unlam.agregarCicloLectivo(cicloLectivo);
		resultadoEsperado = unlam.agregarCicloLectivo(cicloLectivoConFechaSuperpuesta);
		resultadoEsperadoFechasSuperpuestas = cicloLectivo.lasFechasSeSuperponen(cicloLectivoConFechaSuperpuesta);

		assertFalse(resultadoEsperado);
		assertTrue(resultadoEsperadoFechasSuperpuestas);
	
	}
	
	
}
