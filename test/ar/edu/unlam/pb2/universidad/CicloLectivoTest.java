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
		Boolean resultadoEsperado = false;
		Boolean resultadoEsperadoFechasSuperpuestas = false;
		Boolean resultadoEsperadoIdRepetido = false;

		Universidad unlam = new Universidad("Unlam");
		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);

		idCicloLectivo = 2;
		LocalDate nuevaFechaInicioCicloLectivo = LocalDate.of(2023, 7, 14);
		LocalDate nuevaFechaFinalizacionCicloLectivo = LocalDate.of(2023, 12, 14);
		CicloLectivo cicloLectivoConFechaSuperpuesta = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, nuevaFechaInicioCicloLectivo, nuevaFechaFinalizacionCicloLectivo);
		idCicloLectivo = 3;
		CicloLectivo cicloLectivoConIdRepetido = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, nuevaFechaInicioCicloLectivo, nuevaFechaFinalizacionCicloLectivo);

		unlam.agregarCicloLectivo(cicloLectivo);
		resultadoEsperado = unlam.agregarCicloLectivo(cicloLectivoConFechaSuperpuesta);
		resultadoEsperadoFechasSuperpuestas = cicloLectivo.lasFechasSeSuperponen(cicloLectivoConFechaSuperpuesta);

		assertFalse(resultadoEsperado);
		assertTrue(resultadoEsperadoFechasSuperpuestas);

	}

	@Test
	public void queSePuedaAgregarComisionesACicloLectivo() {
//		Comision
		Integer idComision = null;
		Comision comision = null;
		Comision nuevaComision = null;
		Turno turno;
//		CicloLectivo
		Integer idCicloLectivo = 1;
		LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 3, 14);
		LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 7, 14);
		LocalDate fechaInicioInscripcion = LocalDate.of(2023, 12, 31);
		LocalDate fechaFinalizacionInscripcion = LocalDate.of(2023, 8, 4);
		Boolean resultadoEsperado = false;
//		Materia
		Integer idMateria = 1;
		String nombreMateria = "PB1";
//		Alumno
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		LocalDate fechaDeNacimiento = LocalDate.of(2020, 4, 12);
		LocalDate fechaDeIngreso = LocalDate.of(2020, 5, 3);
//		Docente
		Integer idDocente = 1;

		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);
		Materia materia = new Materia(idMateria, nombreMateria);
		Alumno alumno = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Docente docente = new Docente(idDocente);
		Universidad unlam = new Universidad("Unlam");

		idComision = 1;
		turno = Turno.Mañana;
		comision = new Comision(idComision, materia, turno);
		nuevaComision = new Comision(idComision, materia, turno);

		unlam.agregarCicloLectivo(cicloLectivo);
		resultadoEsperado = unlam.agregarComision(cicloLectivo, comision);

		assertTrue(resultadoEsperado);

	}

	@Test
	public void queNoSePuedanGenerarUnaComisionPorCadaCicloLectivo() {
//		Comision
		Integer idComision = null;
		Comision comision = null;
		Comision nuevaComision = null;
		Turno turno;
//		CicloLectivo
		Integer idCicloLectivo = 1;
		LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 3, 14);
		LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 7, 14);
		LocalDate fechaInicioInscripcion = LocalDate.of(2023, 12, 31);
		LocalDate fechaFinalizacionInscripcion = LocalDate.of(2023, 8, 4);
		Boolean resultadoEsperado = false;
//		Materia
		Integer idMateria = 1;
		String nombreMateria = "PB1";
//		Alumno
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		LocalDate fechaDeNacimiento = LocalDate.of(2020, 4, 12);
		LocalDate fechaDeIngreso = LocalDate.of(2020, 5, 3);
//		Docente
		Integer idDocente = 1;

		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);
		Materia materia = new Materia(idMateria, nombreMateria);
		Alumno alumno = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Docente docente = new Docente(idDocente);
		Universidad unlam = new Universidad("Unlam");

		idComision = 1;
		turno = Turno.Mañana;
		comision = new Comision(idComision, materia, turno);
		nuevaComision = new Comision(idComision, materia, turno);

		unlam.agregarCicloLectivo(cicloLectivo);
		unlam.agregarComision(cicloLectivo, comision);
		resultadoEsperado = unlam.agregarComision(cicloLectivo, nuevaComision);

		assertFalse(resultadoEsperado);

	}

	@Test
	public void queNoSePuedanGenerarDosComisionesConLaMismaMateriaYTurno() {
//		Comision
		Integer idComision = null;
		Comision comision = null;
		Comision nuevaComision = null;
		Turno turno;
//		CicloLectivo
		Integer idCicloLectivo = 1;
		LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 3, 14);
		LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 7, 14);
		LocalDate fechaInicioInscripcion = LocalDate.of(2023, 12, 31);
		LocalDate fechaFinalizacionInscripcion = LocalDate.of(2023, 8, 4);
		Boolean resultadoEsperado = false;
//		Materia
		Integer idMateria = 1;
		String nombreMateria = "PB1";
//		Alumno
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		LocalDate fechaDeNacimiento = LocalDate.of(2020, 4, 12);
		LocalDate fechaDeIngreso = LocalDate.of(2020, 5, 3);
//		Docente
		Integer idDocente = 1;

		CicloLectivo cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioInscripcion,
				fechaFinalizacionInscripcion, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo);
		Materia materia = new Materia(idMateria, nombreMateria);
		Alumno alumno = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Docente docente = new Docente(idDocente);
		Universidad unlam = new Universidad("Unlam");

		idComision = 1;
		turno = Turno.Mañana;
		comision = new Comision(idComision, materia, turno);
		nuevaComision = new Comision(idComision, materia, Turno.Tarde);

		unlam.agregarCicloLectivo(cicloLectivo);
		unlam.agregarCicloLectivo(cicloLectivo);
		unlam.agregarComision(cicloLectivo, comision);
		resultadoEsperado = unlam.agregarComision(cicloLectivo, nuevaComision);

		assertFalse(resultadoEsperado);

	}

}
