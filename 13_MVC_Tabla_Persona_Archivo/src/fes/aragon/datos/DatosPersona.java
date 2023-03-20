package fes.aragon.datos;

public class DatosPersona {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String sexo;
	private Long telefono;
	private int codigoPostal;
	private String estadoCivil;
	private String direccion;
	
	public DatosPersona(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "DatosPersona [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", sexo=" + sexo + ", telefono=" + telefono + ", codigoPostal=" + codigoPostal
				+ ", estadoCivil=" + estadoCivil + ", direccion=" + direccion + "]";
	}
	
}