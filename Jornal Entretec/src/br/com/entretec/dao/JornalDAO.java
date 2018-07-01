package br.com.entretec.dao;

import javax.persistence.EntityManager;

import br.com.entretec.model.Jornal;

public class JornalDAO {
	private final DAO<Jornal> dao;

	public JornalDAO(EntityManager em) {
		dao = new DAO<Jornal>(em, Jornal.class);
	}
	
	public void adiciona(Jornal t) {
		dao.adiciona(t);
	}
	
	public void altera(Jornal t) {
		dao.altera(t);
	}
	
	public void remove(Jornal t) {
		dao.remove(t);
	}
	
	public void busca(Integer id) {
		dao.busca(id);
	}
	
	public void lista() {
		dao.lista();
	}
}
