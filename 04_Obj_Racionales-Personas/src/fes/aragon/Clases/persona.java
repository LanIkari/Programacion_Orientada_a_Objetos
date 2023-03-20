package fes.aragon.Clases;

/**
 * @author angel
 *
 */
public class persona {
	private String nombre;
	private String apellidos;
	private float calificacion;
	private int numeroCuenta;
	private String materia;
	
	public persona(String nombre, String apellidos, String materia, float calificacion, int numeroCuenta){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.materia= materia;
		this.calificacion=calificacion;
		this.numeroCuenta=numeroCuenta;
		
	}
	
	
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getApellidos() {
		return apellidos;
	}
	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	private float getCalificacion() {
		return calificacion;
	}
	private void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	private int getNumeroCuenta() {
		return numeroCuenta;
	}
	private void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void informacion(String nombre, String apellidos, int numeroCuenta, String materia) {
		
		System.out.println("Nombre del alumno: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Numero de Cuenta:"+numeroCuenta);
		System.out.println("Materia: "+materia);
		System.out.println("Calificacion: "+calificacion);	
	}
	public void aprovacion(float calificacion) {
		if (calificacion>5.9) {
			 System.out.println("Estado de la materia: aprobada");
		}
		else {
			System.out.println("Estado de la materia: no aprobada");
		}
		
	}
	
}
