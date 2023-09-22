package ar.edu.unlam.pb2.universidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class CicloLectivo {

	private Integer idCicloLectivo;
	private LocalDate fechaInicioInscripcion;
	private LocalDate fechaFinalizacionInscripcion;
	private LocalDate fechaInicioCicloLectivo;
	private LocalDate fechaFinalizacionCicloLectivo;
	private ArrayList<Comision> comisiones;

	public CicloLectivo(Integer idCicloLectivo, LocalDate fechaInicioInscripcion,
			LocalDate fechaFinalizacionInscripcion, LocalDate fechaInicioCicloLectivo,
			LocalDate fechaFinalizacionCicloLectivo) {
		this.idCicloLectivo = idCicloLectivo;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
	}

	public Boolean lasFechasSeSuperponen(CicloLectivo cicloLectivoCopia) {

		if (this.fechaInicioCicloLectivo.getDayOfYear() <= cicloLectivoCopia.fechaFinalizacionCicloLectivo
				.getDayOfYear()
				&& this.fechaFinalizacionCicloLectivo.getDayOfYear() >= cicloLectivoCopia.fechaInicioCicloLectivo
						.getDayOfYear()) {
			return true;
		} else {
			return false;
		}

//		a <= c && b >= d  

	}

	@Override
	public int hashCode() {
		return Objects.hash(idCicloLectivo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CicloLectivo other = (CicloLectivo) obj;
		return Objects.equals(idCicloLectivo, other.idCicloLectivo);
	}

}
