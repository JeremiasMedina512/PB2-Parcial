package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

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
		Date fechaDeNacimiento = new Date();
		Date fechaDeIngreso = new Date();
		Boolean resultadoEsperado =false;
		
		Alumno alumno = new Alumno(idAlumno,nombreAlumno,apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Universidad unlam = new Universidad("Unlam");
		
		resultadoEsperado = unlam.agregarAlumnos(alumno);
		
		assertTrue(resultadoEsperado);
	}
	
	@Test
	public void queLaUniversidadNoPuedaRegistrarAlumnosConElMismoId() {
		Integer idAlumno = 1;
		String nombreAlumno = "Jeremias";
		String apellidoAlumno = "Medina";
		Date fechaDeNacimiento = new Date();
		Date fechaDeIngreso = new Date();
		Boolean resultadoEsperado =false;
		
		Universidad unlam = new Universidad("Unlam");
		Alumno alumnoPrimero = new Alumno(idAlumno,nombreAlumno,apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		Alumno alumnoSegundo = new Alumno(idAlumno,nombreAlumno,apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		
		unlam.agregarAlumnos(alumnoPrimero);
		resultadoEsperado = unlam.agregarAlumnos(alumnoSegundo);
		
		assertFalse(resultadoEsperado);
	}

}
