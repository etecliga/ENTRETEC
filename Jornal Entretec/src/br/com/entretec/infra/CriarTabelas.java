package br.com.entretec.infra;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarTabelas {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ENTRETEC");

        factory.close();
	}

}
