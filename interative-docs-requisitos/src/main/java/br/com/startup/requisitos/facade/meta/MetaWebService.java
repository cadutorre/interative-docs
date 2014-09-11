package br.com.startup.requisitos.facade.meta;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.startup.exception.InterativeDocsException;
import br.com.startup.facade.meta.Meta;
import br.com.startup.facade.meta.MetaFacade;

@ApplicationScoped
@Path(value = "/meta")
public class MetaWebService implements MetaFacade {

	private static final long serialVersionUID = 6818415989284096510L;

	@Inject
	private MetaFacadeLocal metaFacade;

	@Override
	public void salvar(final Meta t) throws InterativeDocsException {
		metaFacade.salvar(t);
	}

	@Override
	public void atualizar(final Meta t) throws InterativeDocsException {
		metaFacade.atualizar(t);
	}

	@Override
	public void deletar(final Meta t) throws InterativeDocsException {
		metaFacade.deletar(t);
	}

	@GET
	@Override
	@Produces(MediaType.APPLICATION_JSON)
	public List<Meta> listar() throws InterativeDocsException {
		return metaFacade.listar();
	}

}
