package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ubicacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUbicacion;
	private Long longitud;
	private Long latitud;

	public Ubicacion(Long idUbicacion, Long longitud, Long latitud) {
		super();
		this.idUbicacion = idUbicacion;
		this.longitud = longitud;
		this.latitud = latitud;
	}
	public Ubicacion() {
		super();
	
	}
	public Long getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Long idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Long getLongitud() {
		return longitud;
	}

	public void setLongitud(Long longitud) {
		this.longitud = longitud;
	}

	public Long getLatitud() {
		return latitud;
	}

	public void setLatitud(Long latitud) {
		this.latitud = latitud;
	}
	
	
}
