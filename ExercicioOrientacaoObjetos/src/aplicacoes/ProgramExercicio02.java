package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProgramExercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario dadosFuncionario = new Funcionario();
		
		System.out.print("\nNome: ");
		dadosFuncionario.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		dadosFuncionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		dadosFuncionario.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.print("Funcionário: " + dadosFuncionario);
		System.out.println();
		System.out.print("Qual porcentagem você quer atribuir ao salário? ");
		double porcentagem = sc.nextDouble();
		System.out.println();
		dadosFuncionario.incrementoSalario(porcentagem);
		
		System.out.print("Atualização dados: " + dadosFuncionario);
		

	}

}
