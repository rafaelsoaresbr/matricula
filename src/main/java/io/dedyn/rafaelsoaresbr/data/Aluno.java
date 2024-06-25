package io.dedyn.rafaelsoaresbr.data;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno extends Person {

	@ManyToOne
	private Responsavel responsavel;

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

}
