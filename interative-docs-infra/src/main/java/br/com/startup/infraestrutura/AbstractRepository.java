package br.com.startup.infraestrutura;

import java.io.Serializable;

import javax.persistence.EntityManager;

public abstract class AbstractRepository implements Serializable {

	private static final long serialVersionUID = 6216991878062202661L;

	protected EntityManager entityManager;

	public AbstractRepository(final EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

}
