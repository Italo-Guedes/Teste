
public class TestePercentual {

	public static void main(String[] args) {
		
		Eleitores percentualEmRelacaoTotal = new Eleitores();
		
		System.out.println("O percentual de votos v�lidos em rela��o ao total de eleitores �: " + (int)percentualEmRelacaoTotal.getpercentualValidos() + "%.");		
		System.out.println("O percentual de votos em brancos em rela��o ao total de eleitores �: " + (int)percentualEmRelacaoTotal.getpercentualVotosBrancos() + "%.");
		System.out.println("O percentual de votos em brancos em rela��o ao total de eleitores �: " + (int)percentualEmRelacaoTotal.getpercentualVotosNulos() + "%.");
				
	}	

}
