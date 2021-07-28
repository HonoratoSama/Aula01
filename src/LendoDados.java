import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		System.out.print("Digite seu Nome: ");
		Scanner leitor = new Scanner(System.in);
		nome = leitor.next();
		System.out.println("Boa noite " + nome);
		leitor.close();

	}

}
