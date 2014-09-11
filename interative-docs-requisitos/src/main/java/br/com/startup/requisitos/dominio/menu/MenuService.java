package br.com.startup.requisitos.dominio.menu;

import javax.inject.Inject;

import br.com.startup.requisitos.annotation.MenuServiceInject;

@MenuServiceInject
public class MenuService {

	private final MenuRepository repository;

	@Inject
	public MenuService(final MenuRepository repository) {
		super();
		this.repository = repository;
	}

}
