package q5;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner fatorial = new Scanner(System.in);

		int n, num, i, j, fat;
		
		System.out.print("Declare o valor N: ");
		n = fatorial.nextInt();

		for( i=1; i<=n ; i++){
		       
		System.out.print("Digite o valor de num: ");
		          
		num = fatorial.nextInt();
		          
		fat = 1 ;
		for( j=1; j<=num ; j++ ){
		fat = fat * j;
		       
		System.out.println("O Fatorial de "+ num +" = " + fat);
		}


	}

	}

}
