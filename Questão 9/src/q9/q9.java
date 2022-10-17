package q9;
import java.util.*;
public class q9 {

	public static void main(String[] args) {
		int num, soma, qtd, maior, menor, qtdpar, mediapar, somapar, qtdimpar, media, perc;
		qtd = 0;
		qtdpar = 0;
		somapar = 0;
		qtdimpar = 0;
		soma = 0;
		maior = 0;
		menor = 0;
		do {
			
		System.out.println("Digite um valor numérico ou digite 30000: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Digite um valor numérico ou digite 30000: ");
		num = sc.nextInt();
		
			if (qtd == 0) {
				maior = maior + num;
				menor = menor + num;
				}
			else {
				
				if (num > maior) {
					maior = maior + num;
				}
				else if (num < menor) {
					menor = menor + num;
					}
				
			}
		soma = soma + 1;
		qtd = qtd + 1;
			if ((num % 2) == 0){
				somapar = somapar + num;
				qtdpar = qtdpar + 1;
				}
			else {
				qtdimpar = qtdimpar + 1;
			}
		
			
			if (qtd == 0) {
				System.out.println("Nenhum número digitado: ");
			}
			else {
				System.out.println("A soma dos números é: " + soma);
				System.out.println("A quantidade de números é: " + qtd);
				media = soma / qtd;
				System.out.println("A média é: " + media);
				System.out.println("O maior valor é: " + maior);
				System.out.println("O menor valor é: " + menor);
				if(qtdpar == 0){
					System.out.println("Nenhum número par.");
				}
				else {
					mediapar = somapar / qtdpar;
					System.out.println("A média dos números pares é: " + mediapar);
				}
				
				perc = qtdimpar * 100 / qtd;
				System.out.println("A porcentagem de números ímpares é: " + perc);
				
			}
			
		}while (num != 30000);
	}

}
