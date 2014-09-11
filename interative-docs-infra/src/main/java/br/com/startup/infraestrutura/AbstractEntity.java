package br.com.startup.infraestrutura;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class AbstractEntity<T extends AbstractEntity<T>> implements Serializable {

	private static final long serialVersionUID = -5236381695496538431L;

	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(final Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}

		final T object = (T) obj;

		return getEqualsBuilder(object).isEquals();
	}

	@Override
	public int hashCode() {
		return getHashCodeBuilder().toHashCode();
	}

	protected abstract EqualsBuilder getEqualsBuilder(T other);

	protected abstract HashCodeBuilder getHashCodeBuilder();

}