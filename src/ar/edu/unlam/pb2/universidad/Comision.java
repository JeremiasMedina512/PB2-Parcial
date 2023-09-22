package ar.edu.unlam.pb2.universidad;

import java.util.ArrayList;
import java.util.Objects;

public class Comision {

	private Integer id;
	private Materia materia;
	private Turno turno;

	public Comision(Integer id, Materia materia, Turno turno) {
		this.id = id;
		this.materia  = materia;
		this.turno = turno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comision other = (Comision) obj;
		return Objects.equals(id, other.id);
	}

	
	
	


}
