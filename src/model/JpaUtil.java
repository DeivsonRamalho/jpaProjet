package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaProjet");

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public void closeEntityManager() {
		factory.close();
	}
}
