package br.com.startup.exception;

/**
 * Classe de exception abstrata do projeto.
 *
 * Todas as classes de exceção devem herdar desta classe.
 *
 * @author leo
 *
 */
public abstract class InterativeDocsException extends Exception {

	private static final long serialVersionUID = 1440954335176573172L;

	public InterativeDocsException() {
		super();
	}

	public InterativeDocsException(final String message) {
		super(message);
	}

	public InterativeDocsException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InterativeDocsException(final Throwable cause) {
		super(cause);
	}

}
