package br.com.etec.dao;


import javax.persistence.EntityManager;

import br.com.etec.model.Usuario;


public class UsuarioDAO {


	private final DAO<Usuario> dao;

	public UsuarioDAO(EntityManager em) {
		dao = new DAO<Usuario>(em, Usuario.class);
	}

	public void adiciona(Usuario t) {
		dao.adiciona(t);
	}
	
}
