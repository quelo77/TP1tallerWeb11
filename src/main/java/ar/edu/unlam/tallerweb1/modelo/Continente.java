package ar.edu.unlam.tallerweb1.modelo;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Continente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idContinente;
	private String nombre;
	@OneToMany(mappedBy="continente", cascade=CascadeType.ALL)
	private List<Pais> paises =new ArrayList<>();

	
	
	public Continente(Long idContinente, String nombre) {
		super();
		this.idContinente = idContinente;
		this.nombre = nombre;
	}
	
	public Continente() {
		super();
		
	}
	public Long getIdContinente() {
		return idContinente;
	}

	public void setId(Long id) {
		this.idContinente = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
