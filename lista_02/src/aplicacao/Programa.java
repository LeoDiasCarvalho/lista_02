/**
 * 
 */
package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

/**
 * @author leo_dias
 */
public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		Produto produto = new Produto();
		
		System.out.println("   Lista de Produtos   ");
		System.out.println();
		
		for( Produto x : lista) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Digite uma opção: ");
		System.out.println("1 - Cadastrar um novo produto.");
		System.out.println("2 - Excluir um produto.");
		System.out.println("3 - Mostrar lista dos produtos cadastrados.");
		int escolha = sc.nextInt();
		
		switch(escolha){
		case 1:
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			int estoque = 0;
			produto = new Produto(nome, preco, estoque);
			lista.add(produto);
			break;
		case 2:
			
			break;
		case 3:
			for(Produto x : lista) {
				System.out.println(x);
			}
			
			break;
		}
		
		
		sc.close();
	}

}
