package q2;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		double soma;
		double raiz;
		int op;
		
		System.out.println("Menu: ");
		System.out.println("1 - Somar dois números.");
		System.out.println("2 - Raiz quadrada de um número.");
		
		System.out.println("Digite sua opção: ");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			
	if (op == 1) {
		
		System.out.println("Digite um valor para o primeiro número: ");
			n1 = sc.nextDouble();
		
		System.out.println("Digite um valor para o segundo número: ");
			n2 = sc.nextDouble();
			
			soma = (n1 + n2);
			System.out.println("A soma dos números é: " + soma);
	}
	
	else if (op == 2) {
		
		System.out.println("Digite um número: ");
			n1 = sc.nextDouble();
			
			raiz = Math.sqrt(n1);
			System.out.println("A raiz do número é: " + raiz);
	}
	
	else {
		
		System.out.println("Erro! Digite uma opção válida.");
	}

	}

}
