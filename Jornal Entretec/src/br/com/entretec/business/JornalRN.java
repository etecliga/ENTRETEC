package br.com.entretec.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.entretec.dao.JornalDAO;
import br.com.entretec.infra.JPAUtil;
import br.com.entretec.model.Jornal;

public class JornalRN {
	
	Jornal jornal = new Jornal();
	List<Jornal> jornais = new ArrayList<Jornal>();
	
	public void gravar(Jornal jornal) {
		EntityManager em = new JPAUtil().getEntity();
		em.getTransaction().begin();
		JornalDAO dao = new JornalDAO(em);
		dao.adiciona(jornal);
		em.getTransaction().commit();
        em.close();
	}

	public Jornal getJornal() {
		return jornal;
	}

	public void setJornal(Jornal jornal) {
		this.jornal = jornal;
	}

	public List<Jornal> getJornais() {
		return jornais;
	}

	public void setJornais(List<Jornal> jornais) {
		this.jornais = jornais;
	}
	
}
