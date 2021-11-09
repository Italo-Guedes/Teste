
public class TestePercentual {

	public static void main(String[] args) {
		
		Eleitores percentualEmRelacaoTotal = new Eleitores();
		
		System.out.println("O percentual de votos válidos em relação ao total de eleitores é: " + (int)percentualEmRelacaoTotal.getpercentualValidos() + "%.");		
		System.out.println("O percentual de votos em brancos em relação ao total de eleitores é: " + (int)percentualEmRelacaoTotal.getpercentualVotosBrancos() + "%.");
		System.out.println("O percentual de votos em brancos em relação ao total de eleitores é: " + (int)percentualEmRelacaoTotal.getpercentualVotosNulos() + "%.");
				
	}	

}
