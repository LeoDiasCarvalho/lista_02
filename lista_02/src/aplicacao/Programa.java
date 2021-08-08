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
		System.out.println();
		
		
		sc.close();
	}

}
