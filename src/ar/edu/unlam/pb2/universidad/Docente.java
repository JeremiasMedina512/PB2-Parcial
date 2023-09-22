package ar.edu.unlam.pb2.universidad;

import java.util.Objects;

public class Docente {

	private Integer dniDocente;

	public Docente(Integer dniDocente) {
		this.dniDocente = dniDocente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dniDocente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente other = (Docente) obj;
		return Objects.equals(dniDocente, other.dniDocente);
	}
	
	

}
