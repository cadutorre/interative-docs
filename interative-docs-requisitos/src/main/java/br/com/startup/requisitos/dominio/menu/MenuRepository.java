package br.com.startup.requisitos.dominio.menu;

import javax.inject.Inject;

import br.com.startup.infraestrutura.AbstractRepository;

public class MenuRepository extends AbstractRepository {

	private static final long serialVersionUID = 5484574859701985627L;

	@Inject
	public MenuRepository() {
		super(null);
	}

	// @Inject
	// public MenuRepository(@RequisitosPU final EntityManager entityManager) {
	// super(entityManager);
	// }

}
