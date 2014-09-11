package br.com.startup.requisitos.facade;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.startup.requisitos.annotation.RequisitosPU;

public abstract class AbstractFacade {

	@Produces
	@RequisitosPU
	@PersistenceContext(name = "requisitosPU")
	protected EntityManager entityManager;

}
