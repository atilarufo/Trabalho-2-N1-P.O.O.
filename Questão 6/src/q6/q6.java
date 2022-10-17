package q6;
import java.util.*;
public class q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número e veja se ele é Primo!");
		
		int num = sc.nextInt();
		int cont = 0;
		
		if (num >1) {
			
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		if(cont == 1) {
			System.out.println(num + " é primo!");
		}
		else {
			System.out.println(num + " não é primo :(");
		}

	}
		else {
			System.out.println("Error!");
		}
	}

}
