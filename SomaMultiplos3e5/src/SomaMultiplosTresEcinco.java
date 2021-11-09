import java.util.Scanner;


public class SomaMultiplosTresEcinco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular a soma dos múltiplos de 3 ou 5: ");
		int numero = scanner.nextInt();
		
		System.out.print("Os múltiplos são: ");
		System.out.println("Soma =  " + somamultiplos(numero));
	}
	

	public static int somamultiplos(int limite) {
		int soma = 0;
		
		for(int multiplos = 1; multiplos <= limite; multiplos++) {
			if(((multiplos % 3) == 0) || ((multiplos % 5) == 0) ) {
				soma += multiplos;
				System.out.print(multiplos + " ");				
			}			
		}
		
		System.out.println();
		return soma;
	}
}


