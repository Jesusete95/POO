public class Letras{
	// Atributo
	private char letra='b';
	// Constructor
	public Letras(String s){
				new Letras();
	}	
	// Constructor privado
	private Letras(){
				this.letra='a';
	}
	// Getter
	public char getLetra(){
				return this.letra;
	}
}


class TestLetra {
	
	public static void main (String args[]) {
	// Creamos objetos
	// Sin referencia
	// new Letras();	NO FUNCIONA, EL CONSTRUCTOR ES PRIVATE
	Letras l1 = new Letras("");
	char let = l1.getLetra();
	System.out.println(l1.getLetra());
	System.out.println(let);
	
	//System.out.println("l1 "+l1.getLetra());
	//System.out.println("let "+let);
	}
}

