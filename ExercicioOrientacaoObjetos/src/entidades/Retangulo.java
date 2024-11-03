package entidades;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		return 2 * (largura + altura);
	}
	
	public double Diagonal() {
		return Math.sqrt((Math.pow(largura, 2) + Math.pow(altura, 2)));
	}
	
	public String toString() {
		return 
		"AREA = " + String.format("%.2f",Area()) + "\n" + "PERIMETRO = " + String.format("%.2f",Perimetro()) + "\n" +
		"DIAGONAL = " + String.format("%.2f",Diagonal());
	}
	
	
}
