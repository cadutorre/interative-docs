package br.com.startup.facade.menu;

import java.util.List;

import br.com.startup.exception.InterativeDocsException;
import br.com.startup.facade.SimpleFacade;

public interface MenuFacade extends SimpleFacade<Menu> {

	List<Menu> buscarMenusPai() throws InterativeDocsException;
}
