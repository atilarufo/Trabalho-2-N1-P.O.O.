package q1;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero e veja se ele � par ou �mpar!");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " � par!");
		}
		else {
			System.out.println(num + " � �mpar!");
		}

	}

}
