
public class DistanciaLeve {

	public static int calculaDistancia(String primeiraPalavra, String segundaPalavra){
		int distanciaTotal=0;
		distanciaTotal += Math.abs(primeiraPalavra.length()-segundaPalavra.length());
		if (primeiraPalavra.length()>=segundaPalavra.length()){
			for (int i=0;i<segundaPalavra.length();i++){
				if (segundaPalavra.charAt(i)!=primeiraPalavra.charAt(i)){
					distanciaTotal++;
				}
			}
		}else{
			for (int i=0; i<primeiraPalavra.length();i++){
				if (segundaPalavra.charAt(i)!=primeiraPalavra.charAt(i)){
					distanciaTotal++;
				}
			}
		}
		return distanciaTotal;
	}
}
