import java.util.Scanner;


public class SomaMultiplosTresEcinco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para calcular a soma dos m�ltiplos de 3 ou 5: ");
		int numero = scanner.nextInt();
		
		System.out.print("Os m�ltiplos s�o: ");
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


