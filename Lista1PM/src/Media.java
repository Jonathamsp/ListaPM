
public class Media {
	Double mediaParaPassar;
	Double mediaParaReprovar;
	public Media(Double mediaParaPassar, Double mediaParaReprovar){
		this.mediaParaPassar = mediaParaPassar;
		this.mediaParaReprovar = mediaParaReprovar;
	}
	public String notasAluno(Double nota1, Double nota2, Double nota3, Double nota4){
		Double media = (nota1+nota2+nota3+nota4)/4;
		if (media>mediaParaPassar){
			return "aluno aprovado";
		}
		else if (media<mediaParaReprovar){
			return "aluno reprovado";
		}else{
			return "aluno na final";
		}
	}
}
