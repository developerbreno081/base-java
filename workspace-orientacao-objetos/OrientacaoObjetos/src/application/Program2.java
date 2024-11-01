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
		System.out.print("Dados do Produto: " + dadosProduto);
		
		System.out.println();
		System.out.println();
		System.out.print("Insira um número corresponde a quantidade de produtos para serem inseridos no estoque: ");
		
		int quantity = sc.nextInt();
		dadosProduto.addProdutos(quantity);
		
		System.out.println();
		System.out.println();
		System.out.print("Update Produto: " + dadosProduto);
		
		System.out.println();
		System.out.println();
		System.out.print("Insira um número corresponde a quantidade de produtos para serem removidos do estoque: ");
		
		quantity = sc.nextInt();
		dadosProduto.removeProdutos(quantity);
		
		System.out.println();
		System.out.print("Remove Produto: " + dadosProduto);
		
		sc.close();

	}

}
