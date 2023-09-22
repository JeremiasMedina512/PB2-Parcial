package ar.edu.unlam.pb2.universidad;

import java.time.LocalDate;
import java.util.Date;

public class Alumno {

	private Integer idAlumno;
	private String nombreAlumno;
	private String apellidoAlumno;
	private LocalDate fechaDeNacimiento;
	private LocalDate fechaDeIngreso;

	public Alumno(Integer idAlumno, String nombreAlumno, String apellidoAlumno, LocalDate fechaDeNacimiento2, LocalDate fechaDeIngreso2) {
		this.idAlumno =idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.fechaDeNacimiento = fechaDeNacimiento2;
		this.fechaDeIngreso = fechaDeIngreso2;
	}

	public Integer getIdAlumno() {
		return this.idAlumno;
	}

}
