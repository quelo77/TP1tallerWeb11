package ar.edu.unlam.tallerweb1.modelo;

//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCiudad;
	@OneToOne
	private Ubicacion ubicacionGeo;
	private String nombre;
	
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="idPais")
	private Pais pais;
	
	
	
	public Ciudad(Long idCiudad, Ubicacion ubicacionGeo, String nombre, Pais pais) {
		super();
		this.idCiudad = idCiudad;
		this.ubicacionGeo = ubicacionGeo;
		this.nombre = nombre;
		this.pais = pais;
	}
	public Ciudad() {
		super();
		
	}
	
	public Long getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}

	public Ubicacion getUbicacionGeo() {
		return ubicacionGeo;
	}
	public void setUbicacionGeo(Ubicacion ubicacionGeo) {
		this.ubicacionGeo = ubicacionGeo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCiudad == null) ? 0 : idCiudad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((ubicacionGeo == null) ? 0 : ubicacionGeo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		if (idCiudad == null) {
			if (other.idCiudad != null)
				return false;
		} else if (!idCiudad.equals(other.idCiudad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (ubicacionGeo == null) {
			if (other.ubicacionGeo != null)
				return false;
		} else if (!ubicacionGeo.equals(other.ubicacionGeo))
			return false;
		return true;
	}
	
	
}
