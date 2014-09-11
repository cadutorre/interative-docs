package br.com.startup.requisitos.facade.meta;

import java.util.List;

import javax.ejb.Stateless;

import br.com.startup.exception.InterativeDocsException;
import br.com.startup.facade.meta.Meta;
import br.com.startup.requisitos.facade.AbstractFacade;

@Stateless
public class MetaFacadeImpl extends AbstractFacade implements MetaFacadeLocal {

	private static final long serialVersionUID = 8163628854301824718L;

	@Override
	public void salvar(final Meta t) throws InterativeDocsException {
	}

	@Override
	public void atualizar(final Meta t) throws InterativeDocsException {
	}

	@Override
	public void deletar(final Meta t) throws InterativeDocsException {
	}

	@Override
	public List<Meta> listar() throws InterativeDocsException {
		return entityManager.createQuery("SELECT meta FROM MetaPersistente meta").getResultList();
	}

}
