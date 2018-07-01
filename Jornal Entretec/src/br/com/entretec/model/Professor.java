package br.com.entretec.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {
	@Id
	@GeneratedValue
	private Integer id;	
	@Embedded
	private DadosPessoais dadosPessoais;
	@Embedded
	private Contato contato;
	private String registroProfesssor;
	
	@OneToMany
	private List<Jornal> jornais;

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getRegistroProfesssor() {
		return registroProfesssor;
	}

	public void setRegistroProfesssor(String registroProfesssor) {
		this.registroProfesssor = registroProfesssor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Jornal> getJornais() {
		return jornais;
	}

	public void setJornais(List<Jornal> jornais) {
		this.jornais = jornais;
	}

}
