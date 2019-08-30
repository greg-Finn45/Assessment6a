package co.grandcircus.assessment6a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table(name="country")
	public class Country {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="name", length=40)
	private String name;

	@Column(name="continent", length=40)
	private String continent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Country(Long id, String name, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
	}

	public Country() {
		super();
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", continent=" + continent + "]";
	}

	
	
	
	
	
	}


