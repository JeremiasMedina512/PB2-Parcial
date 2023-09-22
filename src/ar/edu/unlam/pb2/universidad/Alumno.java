package ar.edu.unlam.pb2.universidad;

import java.util.Date;

public class Alumno {

	private Integer idAlumno;
	private String nombreAlumno;
	private String apellidoAlumno;
	private Date fechaDeNacimiento;
	private Date fechaDeIngreso;

	public Alumno(Integer idAlumno, String nombreAlumno, String apellidoAlumno, Date fechaDeNacimiento, Date fechaDeIngreso) {
		this.idAlumno =idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public Integer getIdAlumno() {
		return this.idAlumno;
	}

}
