package br.com.startup.requisitos.dominio.menu;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

import br.com.startup.facade.menu.Menu;
import br.com.startup.infraestrutura.AbstractEntity;

@Entity
@Table(name = "tab_menu")
public class MenuPersistente extends AbstractEntity<MenuPersistente> implements Menu {

	private static final long serialVersionUID = 1261296994164185670L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "icone")
	private String icone;

	@OneToMany(mappedBy = "menuPai", targetEntity = MenuPersistente.class, fetch = FetchType.EAGER)
	@JsonManagedReference
	private Set<Menu> menusFilhos;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = MenuPersistente.class)
	@JoinColumn(name = "id_menu_pai")
	@JsonBackReference
	private Menu menuPai;

	@Column(name = "url")
	private String url;

	public MenuPersistente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(final String icone) {
		this.icone = icone;
	}

	public Set<Menu> getMenusFilhos() {
		return menusFilhos;
	}

	public void setMenusFilhos(final Set<Menu> menusFilhos) {
		this.menusFilhos = menusFilhos;
	}

	public Menu getMenuPai() {
		return menuPai;
	}

	public void setMenuPai(final Menu menuPai) {
		this.menuPai = menuPai;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	@Override
	protected EqualsBuilder getEqualsBuilder(final MenuPersistente other) {
		return new EqualsBuilder().append(other.getId(), getId());
	}

	@Override
	protected HashCodeBuilder getHashCodeBuilder() {
		return new HashCodeBuilder().append(getId());
	}

}