package ar.edu.unlam.tallerweb1.modelo;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nombre;
	private Long habitantes;
	private String idioma;
	private String capital;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idContinente")
	private Continente continente;
	
	
	public Pais(String nombre, Long habitantes, String idioma, String capital, Continente continente) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.idioma = idioma;
		this.capital = capital;
		this.continente = continente;
	}
	public Pais() {
		super();
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(Long habitantes) {
		this.habitantes = habitantes;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
}
