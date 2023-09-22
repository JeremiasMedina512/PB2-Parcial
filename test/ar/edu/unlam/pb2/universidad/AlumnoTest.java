package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.Test;

import ar.edu.unlam.pb2.universidad.Alumno;
import ar.edu.unlam.pb2.universidad.Materia;
import ar.edu.unlam.pb2.universidad.Universidad;

public class AlumnoTest {

	@Test
	public void queSePuedaCrearAlumno() {
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 4, 12);
		LocalDate fechaDeIngreso = LocalDate.of(2000, 1, 1);
		Boolean resultadoEsperado = false;

		Alumno alumno = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Universidad unlam = new Universidad("Unlam");

		resultadoEsperado = unlam.agregarAlumno(alumno);

		assertTrue(resultadoEsperado);
	}

	@Test
	public void queLaUniversidadNoPuedaRegistrarAlumnosConElMismoId() {
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 4, 12);
		LocalDate fechaDeIngreso = LocalDate.of(2000, 1, 1);
		Boolean resultadoEsperado = false;

		Universidad unlam = new Universidad("Unlam");
		Alumno alumnoPrimero = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Alumno alumnoSegundo = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);

		unlam.agregarAlumno(alumnoPrimero);
		resultadoEsperado = unlam.agregarAlumno(alumnoSegundo);

		assertFalse(resultadoEsperado);
	}

	@Test
	public void inscribirAlumnoAComision() {
		Boolean resultadoEsperado = false;

		Alumno alumno = null;
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 4, 12);
		LocalDate fechaDeIngreso = LocalDate.of(2000, 1, 1);

		Materia materia = null;
		Integer idMateria = 1;
		String nombreMateria = "PB1";

		CicloLectivo cicloLectivo = null;
		Integer idCicloLectivo = 1;
		LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 8, 14);
		LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 12, 1);
		LocalDate fechaInicioInscripcion = LocalDate.of(2023, 8, 2);
		LocalDate fechaFinalizacionInscripcion = LocalDate.of(2023, 8, 4);

		Comision comision = null;
		Integer idComision = 1;
		Turno turno = Turno.Mañana;

		alumno = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		materia = new Materia(idMateria, nombreMateria);
		cicloLectivo = new CicloLectivo(idCicloLectivo, fechaInicioCicloLectivo, fechaFinalizacionCicloLectivo,
				fechaInicioInscripcion, fechaFinalizacionInscripcion);
		
		comision = new Comision (idComision, materia, turno);

		Universidad unlam = new Universidad("Unlam");
		Alumno alumnoPrimero = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
	
		unlam.agregarAlumno(alumnoPrimero);
		unlam.agregarComision(comision);
		

		assertFalse(resultadoEsperado);
	}

}
