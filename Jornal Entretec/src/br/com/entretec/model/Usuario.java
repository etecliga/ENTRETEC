package br.com.entretec.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private Integer id;
	@Embedded
	private DadosPessoais dadosPessoais;
	@Embedded
	private Contato contato;
	@Embedded
	private Endereco endereco;
	
	@OneToMany
	private List<Jornal> jornais;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

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
