import java.util.Scanner; 
public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número para calcular o Fatorial: ");
		int numero = scanner.nextInt(); 
		
		int fatorial = 1;
		
		for(int n = 1; n <= numero; n++) {
			fatorial = fatorial * n;
		}
		System.out.println( + numero + "! = " + fatorial);
	}

}
