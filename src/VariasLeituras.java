import java.util.Scanner;

public class VariasLeituras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo;
		double preço;
		String nome, texto;
		
		System.out.println("Digite o codigo:");
		texto = teclado.nextLine();
		codigo = Integer.parseInt(texto);
				
		System.out.println("Digite o nome:");
		nome = teclado.nextLine();
		
		System.out.println("Digite o preço:");
		texto = teclado.nextLine();
		preço = Double.parseDouble(texto);
		
		System.out.println("Você digitou " + codigo + " - " + nome + " - " + " R$ " +preço);
		
		teclado.close();


	}

}
