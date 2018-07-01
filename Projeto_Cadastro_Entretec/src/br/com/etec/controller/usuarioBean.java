package br.com.etec.controller;

import javax.faces.bean.ManagedBean;

import javax.persistence.EntityManager;

import br.com.etec.business.UsuarioRN;
import br.com.etec.dao.UsuarioDAO;
import br.com.etec.model.Usuario;

@ManagedBean

public class usuarioBean {
	private Usuario usuario = new Usuario();

	UsuarioRN serviceUsuario = new UsuarioRN();
	
	public void gravar(ActionEvent actionEvent) {
		if(usuario.getId() == null){
			serviceUsuario.gravar(usuario);
        }
	}
       

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
