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
			
		System.out.println("Digite um valor num�rico ou digite 30000: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Digite um valor num�rico ou digite 30000: ");
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
				System.out.println("Nenhum n�mero digitado: ");
			}
			else {
				System.out.println("A soma dos n�meros �: " + soma);
				System.out.println("A quantidade de n�meros �: " + qtd);
				media = soma / qtd;
				System.out.println("A m�dia �: " + media);
				System.out.println("O maior valor �: " + maior);
				System.out.println("O menor valor �: " + menor);
				if(qtdpar == 0){
					System.out.println("Nenhum n�mero par.");
				}
				else {
					mediapar = somapar / qtdpar;
					System.out.println("A m�dia dos n�meros pares �: " + mediapar);
				}
				
				perc = qtdimpar * 100 / qtd;
				System.out.println("A porcentagem de n�meros �mpares �: " + perc);
				
			}
			
		}while (num != 30000);
	}

}
