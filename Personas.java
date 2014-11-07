public class Personas {
	// Atributos
	private String nombre;
	private int edad;
	// Constructor
	public Personas(String n, int e){
				this.nombre=n;
				this.edad=e;
	}
	// Getters porque los atributos son private
	public String getNombre() {
				return this.nombre;
	}
	public int getEdad() {
				return this.edad;
	}
	//Setters
	public void setNombre(String n) {
				this.nombre=n;
	}
	public void setEdad(int e) {
				this.edad=e;
	}
}

class TestPersona {
	public static void main (String args[]) {
		// Sin referencia
		new Personas("Jesus", 23);
		new Personas("Jesus", 23);
		// new Personas(23, "Juan"); NO FUNCIONA, ES NECESARIO MANTENER EL ORDEN
		// Con referencia
		Personas p1 = new Personas("Jesus", 19);
		// Personas p1 = new Personas("Juan Antonio", 33);  NO PUEDO USAR DE NUEVO EL MISMO VALOR PARA LA REFERENCIA
		Personas p2 = new Personas("Paco", 19);
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		p1=p2;
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		p1.setNombre("Kike Kinder"); p1.setEdad(69);
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());	
	}
}

