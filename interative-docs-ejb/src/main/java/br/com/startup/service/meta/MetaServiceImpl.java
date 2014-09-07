package br.com.startup.service.meta;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.startup.exception.InterativeDocsException;
import br.com.startup.service.Meta;
import br.com.startup.service.MetaService;

@Path(value = "/meta")
@Stateless
public class MetaServiceImpl implements MetaService {

	private static final long serialVersionUID = -5699234917453392144L;

	@PersistenceContext(name = "ejbPU")
	private EntityManager entityManager;

	@Override
	public void salvar(final Meta t) throws InterativeDocsException {

	}

	@Override
	public void atualizar(final Meta t) throws InterativeDocsException {

	}

	@Override
	public void deletar(final Meta t) throws InterativeDocsException {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Meta> listar() throws InterativeDocsException {
		return entityManager.createQuery("SELECT meta FROM MetaPersistente meta").getResultList();
	}

}
