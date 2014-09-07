package br.com.startup.exception;

/**
 * Classe que representa uma exceção de infraestrutura.
 *
 * @author leo
 *
 */
public class InfraestruturaException extends InterativeDocsException {

	private static final long serialVersionUID = 3735879742633623442L;

	public InfraestruturaException() {
		super();
	}

	public InfraestruturaException(final String message) {
		super(message);
	}

	public InfraestruturaException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InfraestruturaException(final Throwable cause) {
		super(cause);
	}

}
