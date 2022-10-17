package q10;
import java.util.*;
public class q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int i = 0;
		int result = 0;
		int num = 0;

		System.out.println("Digite o número no qual você deseja a tabuada: ");
		num = sc.nextInt();

		for ( i=1; i<=10; i++){

		result = num * i;

		System.out.println(num + "x" + i + "=" + result);
		}

	}

}
