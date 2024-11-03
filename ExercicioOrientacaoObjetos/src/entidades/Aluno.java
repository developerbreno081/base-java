package entidades;

public class Aluno {
	
	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double TerceiraNota;
	
	public double notaFinal() {
		return primeiraNota + segundaNota + TerceiraNota; 
	}
	
	public double missingPoints() {
		if (notaFinal() < 60.0) {
		return 60.0 - notaFinal();
		}
		else {
		return 0.0;
		}
	
}
}
