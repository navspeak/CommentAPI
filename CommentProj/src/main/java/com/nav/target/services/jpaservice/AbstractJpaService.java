package com.nav.target.services.jpaservice;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public abstract class AbstractJpaService {
	@PersistenceUnit
	public EntityManagerFactory emf;
}
