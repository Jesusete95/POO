public class Circulo {
	
	//Atributos
	/*Cualquier Circulo que creemos tendrá
	 * siempre un valor INICIAL de 5 */
	private int radio=5;
	
	//Métodos
	public int getRadio(){
			return this.radio;
		
	}
	//Método que cambia el valor del radio
	public void  setRadio(int r){
		this.radio=r;
	}
}


class TestCirculo{
	public static void main(String[] args){
		
		//crea un objeto de tipo círculo
		Circulo c1 = new Circulo(); //Crea un Circulo de radio 5
		System.out.println("Radio del circulo: "+ c1.getRadio());
		Circulo c2 = new Circulo(); //Crea un Circulo de radio 5
		//Cambio el radio del Circulo c2 a un valor de 15
		c2.setRadio(15);
		System.out.println("Radio del circulo: "+ c2.getRadio());
	}
}

