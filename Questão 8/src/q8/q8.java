package q8;
import java.util.*;
public class q8 {

	public static void main(String[] args) {
		
		int op, imp, sal, aum, novosal;
		
		System.out.println("Menu: ");
		System.out.println("1 - Imposto sobre o salário.");
		System.out.println("2 - Novo Salário.");
		System.out.println("3 - Classificação salarial.");
		System.out.println("4 - Fim.");
		
		System.out.println("Digite a opção desejada: ");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
		
		if ((op > 4) || (op < 1)) {
			System.out.println("Opção inválida.");
		}
		
		if (op == 1) {
			System.out.println("Digite o salário: ");
				sal = sc.nextInt();
			if (sal < 500) {
				imp = sal * 5/100;
			System.out.println("O valor do imposto é: " + imp);
			}
			else if ((sal >= 500) && (sal <= 850)) {
				imp = sal * 10/100;
			System.out.println("O valor do imposto é: " + imp );
			}
			else if (sal > 850) {
				imp = sal * 15/100;
			System.out.println("O valor do imposto é: " + imp);
			}
			
			}
		if (op == 2) {
			System.out.println("Digite o salário: ");
			sal = sc.nextInt();
			if (sal > 1500) {
				aum = 25;
				novosal = sal + aum;
			System.out.println("O novo salário será: " + novosal);
			}
			else if ((sal >= 750) && (sal <= 1500)) {
				aum = 50;
				novosal = sal + aum;
			System.out.println("O novo salário será: " + novosal);
			}
			else if ((sal >= 450) && (sal < 750)) {
				aum = 75;
				novosal = sal + aum;
			System.out.println("O novo salário será: " + novosal);
			}
			else if (sal < 450) {
				aum = 100;
				novosal = sal + aum;
			System.out.println("O novo salário será: " + novosal);
			}
			
		}
		
		if (op == 3) {
			System.out.println("Digite o salário: ");
			sal = sc.nextInt();
			if (sal <= 700) {
				System.out.println("Mal remunerado.");
			}
			else {
				System.out.println("Bem remunerado.");
			}
		}
		
		if (op == 4) {
			System.out.println("Fim do programa.");
		}
	
	}
}
