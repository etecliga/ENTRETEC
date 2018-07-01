package br.com.etec.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.etec.dao.UsuarioDAO;
import br.com.etec.infra.JPAUtil;
import br.com.etec.model.Usuario;

public class UsuarioRN {
	
	Usuario usuario = new Usuario();
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void gravar(Usuario entity){
		EntityManager em = new JPAUtil().getGerenciadorDeEntidade();
        em.getTransaction().begin();
        UsuarioDAO dao = new UsuarioDAO(em);
        dao.adiciona(entity);
        em.getTransaction().commit();
        em.close();
	}
	
	/*
	 * getters e setters
	 * 
	 * 
	 */
	
	public Usuario getEntity(){
		return usuario;
	}
	
	public void setEntity(Usuario entity){
		this.usuario = entity;
	}
	
	public List<Usuario> getEntities(){
		return usuarios;
	}
	
	public void setEntities(List<Usuario> entities){
		this.usuarios = entities;
	}

}
