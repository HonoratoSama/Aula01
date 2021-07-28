import java.util.Scanner;

public class TrabalhandoComNumeros {

	public static void main(String[] args) {
		int num1, num2;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		System.out.println("o total é: "+ (num1 + num2));
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		System.out.println("o total é: "+ (num1 - num2));
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		System.out.println("o total é: "+ (num1 * num2));
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leitor.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = leitor.nextInt();
		System.out.println("o total é: "+ (num1 / num2));
		leitor.close();

	}

}
