
public class Eleitores {
	private int totalDeEleitores = 1000;
	private double votosValidos = 800;
	private double votosBrancos = 150;
	private double votosNulos = 50;
	
	
	public double getpercentualValidos() {
		double percentualVotosValidos = (votosValidos / totalDeEleitores);
		return (percentualVotosValidos * 100);
	}
	
	public double getpercentualVotosBrancos() {
		double percentualVotosBrancos = (votosBrancos / totalDeEleitores);
		return (percentualVotosBrancos * 100);		
	}
	
	public double getpercentualVotosNulos() {
		double percentualVotosNulos = (votosNulos / totalDeEleitores);
		return (percentualVotosNulos * 100);		
	}

}
