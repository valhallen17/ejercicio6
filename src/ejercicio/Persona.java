package ejercicio;

public class Persona {

	private int edad;
	private String nombre;
	private String telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}


class Cliente extends Persona{
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
		System.out.println("Teléfono: "+getTelefono());
		System.out.println("Crédito: "+getCredito());
	}
	
}

class Trabajador extends Persona{
	private int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
		System.out.println("Teléfono: "+getTelefono());
		System.out.println("Salario: "+getSalario());
	}
	
}
