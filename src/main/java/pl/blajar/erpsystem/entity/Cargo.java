package pl.blajar.erpsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "cargo")
public class Cargo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4944243484717907966L;
	@Id
	@Column(name ="id")
	Long id;
	@Column(name = "name")
	String name;
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
	
	
	
}
