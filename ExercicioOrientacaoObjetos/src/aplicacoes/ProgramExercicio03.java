package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class ProgramExercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.primeiraNota = sc.nextDouble();
		aluno.segundaNota = sc.nextDouble();
		aluno.TerceiraNota = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
			}
			else {
			System.out.println("PASS");
			}
			sc.close();
	}

}
