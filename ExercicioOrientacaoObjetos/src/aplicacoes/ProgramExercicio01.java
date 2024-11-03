package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgramExercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo calculoRetangulo = new Retangulo();
		calculoRetangulo.largura = sc.nextDouble();
		calculoRetangulo.altura = sc.nextDouble();
		
		System.out.print(calculoRetangulo);
	}

}
