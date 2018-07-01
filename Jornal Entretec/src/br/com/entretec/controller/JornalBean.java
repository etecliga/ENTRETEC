package br.com.entretec.controller;

import javax.annotation.ManagedBean;

import br.com.entretec.model.Jornal;

@ManagedBean
public class JornalBean {
	private Jornal jornal = new Jornal();

	public Jornal getJornal() {
		return jornal;
	}

	public void setJornal(Jornal jornal) {
		this.jornal = jornal;
	}
	

}
