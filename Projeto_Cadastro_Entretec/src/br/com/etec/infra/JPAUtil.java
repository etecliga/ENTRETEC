package br.com.etec.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static  EntityManagerFactory gerenciadorDeEntidade = Persistence.createEntityManagerFactory("ENTRETEC"); //Colocar o nome da persistence-unit
	
	public EntityManager getGerenciadorDeEntidade(){
		return gerenciadorDeEntidade.createEntityManager();  
	}
}
