package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto dadosProduto;
		dadosProduto = new Produto();
		System.out.print("Digite as informações do produto:\n");
		System.out.print("Nome: ");
		dadosProduto.nome = sc.next();
		System.out.print("Preço: ");
		dadosProduto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		dadosProduto.quantidade = sc.nextInt();
		System.out.println();
		
		double total = dadosProduto.totalEmEstoque();
		System.out.printf("Dados do produto: %s, $ %.2f, %d unidades, Total: $ %.2f%n", dadosProduto.nome,dadosProduto.preco,dadosProduto.quantidade,total);
		
		System.out.print("Quantos produtos você quer adicionar no estoque? ");
		dadosProduto.quantidade = sc.nextInt();
		System.out.printf("Dados do produto: %s, $ %.2f, %d unidades, Total: $ %.2f%n", dadosProduto.nome,dadosProduto.preco,dadosProduto.addProdutos(5),total);

	}

}
