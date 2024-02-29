package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o produtos desejado: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade no estoque é de: ");
		int quantidade = sc.nextInt();

		Produtos produto = new Produtos(nome, preco, quantidade);

		System.out.println(produto.toString());

		System.out.println("Quantos produtos deseja adicionar no estoque: ");
		int addQuantidade = sc.nextInt();
		produto.addProdutos(addQuantidade);

		System.out.println(produto.toString());

		System.out.println("Quantos produtos deseja adicionar no estoque: ");
		int removeQuantidade = sc.nextInt();
		produto.removeProdutos(removeQuantidade);

		System.out.println(produto.toString());

		sc.close();

	}

}
