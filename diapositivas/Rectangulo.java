public class Rectangulo {
	
	//Atributos
	private int alto=2;
	private int ancho=4;
	
	
	//Métodos
	public int getAlto(){
			return this.alto;
}
    
	public int getAncho(){
			return this.ancho;
}
	//Métodos mutantes		
	public void setAlto(int a){
			this.alto=a;
}
	
	public void setAncho(int a){
			this.ancho=a;
} 

    //Método para obtener el área
    public int getArea(){
		return this.alto*this.ancho;
}

}

class TestRectangulo{
	public static void main(String[] args){
		
		//crea un objeto de tipo rectángulo
		Rectangulo r1 = new Rectangulo(); 
		System.out.println("Rectangulo de alto "+ r1.getAlto()+" y ancho "+r1.getAncho()+" tiene un valor de area igual a "+r1.getArea());
}	
}	

		

