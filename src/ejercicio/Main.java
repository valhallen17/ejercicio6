package ejercicio;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNombre("Pablo");
		c1.setEdad(27);
		c1.setTelefono("0800123123");
		c1.setCredito(500);
		c1.mostrarDatos();
		
		System.out.println("______________________");
		
		Trabajador t1 = new Trabajador();
		t1.setNombre("Héctor");
		t1.setEdad(40);
		t1.setSalario(15000);
		t1.setTelefono("0800543210");
		t1.mostrarDatos();
	}

}
