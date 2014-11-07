public class Digitos {
	private int valor;
}	
	
class Digitos2 {
	private int valor;
	// Constructor
	public Digitos2() {
				this.valor=5;
	}
	// Constructor
	public Digitos2 (int d) {
				this.valor=d;
	}
	// Getter
	public int getValor() {
				return this.valor;
	}
	// Setter
	public void setValor(int d) {
				this.valor=d;
	}
}

class TestDigito{	
	public static void main (String args[]) {
			/* Vamos a crear un objeto de la clase Digitos 
			 * sin que tenga un constructor y además
			 * sin referencias*/
			 new Digitos();
			// Creo ahora un objeto Digitos con referencia
			Digitos d = new Digitos();
			// Intento acceder al valor de un atributo
			// System.out.println(d.valor); NO PUEDO ACCEDER PORQUE EL valor ES PRIVATE
		    Digitos2 d2 = new Digitos2(); 
		    System.out.println(d2.getValor());
		    // d2.Digitos2(8); NO FUNCIONA, TAMPOCO ESTO d2.valor=8; PORQUE ATRIBUTO valor ES DE TIPO PRIVATE
		    Digitos2 d22 = new Digitos2(8);
		    System.out.println(d22.getValor()); // Para comprobar que se inicializa al valor de 8
			d22.setValor(18);
		    System.out.println(d22.getValor()); // Para comprobar que se actualiza al valor de 18
	}
}

