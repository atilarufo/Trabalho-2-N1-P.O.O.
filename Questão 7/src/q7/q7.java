package q7;
import java.util.*;
public class q7 {

	public static void main(String[] args) {
		double conttime, contjog, idade, peso, alt, qtde, mediaidade, mediaaltura, porc, tot80;
		qtde = 0;
		tot80 = 0;
		for (conttime = 1; 1 < 5;) {
			mediaidade = 0;
			mediaaltura = 0;
			for (contjog = 1; 1 < 11; contjog++) {
				System.out.println("Digite idade: ");
				Scanner sc = new Scanner(System.in);
				idade = sc.nextInt();
				System.out.println("Digite peso: ");
				peso = sc.nextInt();
				System.out.println("Digite altura: ");
				alt = sc.nextInt();
				if (idade < 18) {
					qtde = qtde + 1;
					mediaidade = mediaidade + idade;
					mediaaltura = mediaaltura + alt;
				if (peso > 80) {
					tot80 = tot80 + 1;
				}
				}
			System.out.println("A média das idades é: " + mediaidade);
			System.out.println("A quantidade de jogadores menores é: " + qtde);
			mediaaltura = mediaaltura/55;
			System.out.println("A média das alturas é: " + mediaaltura);
			porc = tot80 * 100/55;
			System.out.println("A porcentagem de jogadores com mais de 80 kg é: " + porc + "%");
			}
		
		
		}
		
	}

	
}


