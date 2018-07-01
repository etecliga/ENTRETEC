package br.com.entretec.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contato {
	private String email;
	private Integer dddCelular;
	private Integer numeroCelular;
	private Integer dddTelefone;
	private Integer numeroTelefone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getDddCelular() {
		return dddCelular;
	}
	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}
	public Integer getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public Integer getDddTelefone() {
		return dddTelefone;
	}
	public void setDddTelefone(Integer dddTelefone) {
		this.dddTelefone = dddTelefone;
	}
	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	

}
