package br.com.entretec.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static  EntityManagerFactory factory = Persistence.createEntityManagerFactory("ENTRETEC"); //Colocar o nome da persistence-unit
	
	public EntityManager getEntity(){
		return factory.createEntityManager();  
	}
}
