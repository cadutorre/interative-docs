package br.com.startup.requisitos.facade.menu;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.startup.exception.InterativeDocsException;
import br.com.startup.facade.menu.Menu;
import br.com.startup.facade.menu.MenuFacade;

@ApplicationScoped
@Path(value = "/menu")
public class MenuWebService implements MenuFacade {

	private static final long serialVersionUID = -5417729869792286177L;

	@Inject
	private MenuFacadeLocal menuFacade;

	@Override
	public void salvar(final Menu t) throws InterativeDocsException {
		menuFacade.salvar(t);
	}

	@Override
	public void atualizar(final Menu t) throws InterativeDocsException {
		menuFacade.atualizar(t);
	}

	@Override
	public void deletar(final Menu t) throws InterativeDocsException {
		menuFacade.deletar(t);
	}

	@Override
	public List<Menu> listar() throws InterativeDocsException {
		return menuFacade.listar();
	}

	@GET
	@Override
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<Menu> buscarMenusPai() throws InterativeDocsException {
		return menuFacade.buscarMenusPai();
	}

}
