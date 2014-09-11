package br.com.startup.requisitos.facade.menu;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.startup.exception.InterativeDocsException;
import br.com.startup.facade.menu.Menu;
import br.com.startup.requisitos.annotation.MenuServiceInject;
import br.com.startup.requisitos.dominio.menu.MenuService;
import br.com.startup.requisitos.facade.AbstractFacade;

@Stateless
public class MenuFacadeImpl extends AbstractFacade implements MenuFacadeLocal {

	private static final long serialVersionUID = 8163628854301824718L;

	@Inject
	@MenuServiceInject
	private MenuService service;

	@Override
	public List<Menu> buscarMenusPai() throws InterativeDocsException {
		return entityManager.createQuery("SELECT menu FROM MenuPersistente menu WHERE menuPai IS NULL").getResultList();
	}

	@Override
	public void salvar(final Menu t) throws InterativeDocsException {

	}

	@Override
	public void atualizar(final Menu t) throws InterativeDocsException {

	}

	@Override
	public void deletar(final Menu t) throws InterativeDocsException {

	}

	@Override
	public List<Menu> listar() throws InterativeDocsException {
		return null;
	}

}
