package ar.edu.unlam.pb2.universidad;

import java.util.ArrayList;

public class Materia {

	private Integer idMateria;
	private String nombreMateria;
	private ArrayList<Materia> correlativas;

	public Materia(Integer idMateria, String nombreMateria) {
		this.idMateria = idMateria;
		this.nombreMateria = nombreMateria;
		this.correlativas = new ArrayList<>();
	}

	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdMateria() {
		// TODO Auto-generated method stub
		return this.idMateria;
	}

	public Boolean asignarMateriaCorrelativa(Materia materiaCorrelativa) {
		for (int i = 0; i < this.correlativas.size(); i++) {
			if (this.correlativas.get(i).getIdMateria().equals(materiaCorrelativa.getIdMateria())) {
				return false;
			}
		}
		return this.correlativas.add(materiaCorrelativa);
	}

	public Boolean eliminarMateriaCorrelativa(Materia materiaCorrelativa) {
		for (int i = 0; i < this.correlativas.size(); i++) {
			if (this.correlativas.get(i).getIdMateria().equals(materiaCorrelativa.getIdMateria())) {
				return false;
			}
		}
		return null;
	}

}
