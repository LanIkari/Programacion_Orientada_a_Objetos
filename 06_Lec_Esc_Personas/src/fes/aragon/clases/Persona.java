package fes.aragon.clases;

public class Persona {
	private String nombre;
	private String apelPat;
	private String apelMat;
	private String edad;
	private String sexo;
	private String estCivil;
	private String telefono;
	private String celular;
	private String correo;

	public Persona(String nombre, String apelPat, String apelMat, String edad, String sexo, String estCivil,
			String telefono, String celular, String correo) {
		super();
		this.nombre = nombre;
		this.apelPat = apelPat;
		this.apelMat = apelMat;
		this.edad = edad;
		this.sexo = sexo;
		this.estCivil = estCivil;
		this.telefono = telefono;
		this.celular = celular;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelPat() {
		return apelPat;
	}

	public void setApelPat(String apelPat) {
		this.apelPat = apelPat;
	}

	public String getApelMat() {
		return apelMat;
	}

	public void setApelMat(String apelMat) {
		this.apelMat = apelMat;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido Paterno: " + apelPat + "\nApellido Materno: " + apelMat + "\nEdad: "
				+ edad + "\nSexo: " + sexo + "\nEstado Cívil: " + estCivil + "\nTeléfono: " + telefono + "\nCelular: "
				+ celular + "\nCorreo: " + correo + "\n";
	}

}
