package ar.edu.unlam.pb2.universidad;

import java.util.Objects;

public class Docente {

	private Integer idDocente;

	public Docente(Integer idDocente) {
		this.idDocente = idDocente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDocente);
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
		return Objects.equals(idDocente, other.idDocente);
	}
	
	

}
