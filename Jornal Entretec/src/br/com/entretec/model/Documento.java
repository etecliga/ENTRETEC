package br.com.entretec.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Documento {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String conteudo;
	private Date dataLancamento;
	
	@OneToMany
	private List<Jornal> jornais;

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public List<Jornal> getJornais() {
		return jornais;
	}

	public void setJornais(List<Jornal> jornais) {
		this.jornais = jornais;
	}

}
