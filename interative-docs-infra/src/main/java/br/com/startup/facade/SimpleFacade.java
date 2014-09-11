package br.com.startup.facade;

import java.io.Serializable;
import java.util.List;

import br.com.startup.exception.InterativeDocsException;

public interface SimpleFacade<T> extends Serializable {

	void salvar(T t) throws InterativeDocsException;

	void atualizar(T t) throws InterativeDocsException;

	void deletar(T t) throws InterativeDocsException;

	List<T> listar() throws InterativeDocsException;

}
