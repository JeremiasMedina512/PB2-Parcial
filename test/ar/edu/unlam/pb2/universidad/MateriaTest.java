package ar.edu.unlam.pb2.universidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import ar.edu.unlam.pb2.universidad.Materia;
import ar.edu.unlam.pb2.universidad.Universidad;

public class MateriaTest {

	@Test
	public void queLaUniversidadRegistreMateria() {
		Integer idMateria = 1;
		String nombreMateria = "PB1";
		Boolean resultadoEsperado = false;

		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia(idMateria, nombreMateria);

		resultadoEsperado = unlam.agregarMateria(materia);

		assertTrue(resultadoEsperado);
	}

	@Test
	public void queLaUniversidadNoPuedaRegistrarMateriasConElMismoId() {
		Integer idMateria = 1;
		String nombreMateria = "PB1";
		Boolean resultadoEsperado = false;

		Universidad unlam = new Universidad("Unlam");
		Materia materiaPrimera = new Materia(idMateria, nombreMateria);
		Materia materiaSegunda = new Materia(idMateria, nombreMateria);

		unlam.agregarMateria(materiaPrimera);
		resultadoEsperado = unlam.agregarMateria(materiaSegunda);

		assertFalse(resultadoEsperado);
	}

	@Test
	public void queLaUniversidadAsigneMateriaCorrelativa() {
		Integer idMateriaPrimera = 1;
		String nombreMateriaPrimera = "PB1";
		Integer idMateriaSegunda = 2;
		String nombreMateriaSegunda = "PB2";
		Boolean resultadoEsperado = false;

		Universidad unlam = new Universidad("Unlam");
		Materia materiaPrimera = new Materia(idMateriaPrimera, nombreMateriaPrimera);
		Materia materiaSegunda = new Materia(idMateriaSegunda, nombreMateriaSegunda);

		unlam.agregarMateria(materiaPrimera);
		unlam.agregarMateria(materiaSegunda);
		resultadoEsperado = unlam.agregarCorrelatividad(materiaSegunda.getIdMateria(),
				materiaPrimera.getIdMateria());

		assertTrue(resultadoEsperado);
	}
	
	@Test
	public void queLaUniversidadElimineMateriaCorrelativa() {
		Integer idMateriaPrimera = 1;
		String nombreMateriaPrimera = "PB1";
		Integer idMateriaSegunda = 2;
		String nombreMateriaSegunda = "PB2";
		Boolean resultadoEsperado = false;

		Universidad unlam = new Universidad("Unlam");
		Materia materiaCorrelativa = new Materia(idMateriaPrimera, nombreMateriaPrimera);
		Materia materia = new Materia(idMateriaSegunda, nombreMateriaSegunda);

		unlam.agregarMateria(materiaCorrelativa);
		unlam.agregarMateria(materia);
		resultadoEsperado = unlam.eliminarCorrelatividad(materia.getIdMateria(),
				materiaCorrelativa.getIdMateria());

		assertTrue(resultadoEsperado);
	}

}
