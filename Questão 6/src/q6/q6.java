package q6;
import java.util.*;
public class q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero e veja se ele � Primo!");
		
		int num = sc.nextInt();
		int cont = 0;
		
		if (num >1) {
			
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		if(cont == 1) {
			System.out.println(num + " � primo!");
		}
		else {
			System.out.println(num + " n�o � primo :(");
		}

	}
		else {
			System.out.println("Error!");
		}
	}

}
