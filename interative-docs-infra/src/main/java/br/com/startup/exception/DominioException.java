package br.com.startup.exception;

/**
 * Classe que representa uma exceção de regra de negócio.
 *
 * @author leo
 *
 */
public class DominioException extends InterativeDocsException {

	private static final long serialVersionUID = 3735879742633623442L;

	public DominioException() {
		super();
	}

	public DominioException(final String message) {
		super(message);
	}

	public DominioException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DominioException(final Throwable cause) {
		super(cause);
	}

}
