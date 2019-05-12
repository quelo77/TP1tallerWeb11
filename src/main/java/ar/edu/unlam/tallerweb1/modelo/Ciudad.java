package ar.edu.unlam.tallerweb1.modelo;

public class Ciudad {
	private Long idCiudad;
	private Long ubicacionGeo;
	private String nombre;
	private Pais pais;
	
	public Long getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}
	public Long getUbicacionGeo() {
		return ubicacionGeo;
	}
	public void setUbicacionGeo(Long ubicacionGeo) {
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
	
	
}
