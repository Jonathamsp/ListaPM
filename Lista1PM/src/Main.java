
public class Main {
	public static void main(String[] args){
			
		Divisores divisores = new Divisores(10);
		System.out.println(divisores.retornaDivisores());
		
		Media escolaTioCareca = new Media(7.0, 4.0);
		System.out.println(escolaTioCareca.notasAluno(6.0, 7.4, 8.2, 1.2));
		
		final String RESULTADOS[][] ={{"Flamengo", "3",	"0",	"Volta	Redonda"},
									{"Volta Redonda",	"1",	"1",	"Botafogo"},
									{"Bonsucesso",	"5",	"0",	"Maca�"},
									{"Maca�",	"3",	"4",	"Fluminense"},
									{"Botafogo",	"2",	"2",	"Flamengo"}
		};
		
		Times times = new Times(RESULTADOS, 5);
		System.out.println(times.quantidadePontos("Botafogo"));
		
		System.out.println(DistanciaLeve.calculaDistancia("Estrangulado", "Eletrocutado"));
			
	};
	public String tipoTriangulo(int lado1, int lado2, int lado3){
		if (lado1>lado2+lado3||lado2>lado1+lado3||lado3>lado1+lado2){
			int aux=0;
			if(lado1==lado2){
				aux++;
			}
			if (lado2 == lado3){
				aux++;
			}
			if (lado3==lado1){
				aux++;
			}
			if (aux==0){
				return "triangulo escaleno";
			}
			if (aux==1){
				return "triangulo isoceles";
			}
			if (aux>1){
				return "triangulo equilatero";
			}
		}else{
			return "Triangulo nao existe";
		}
		return "nao sei como conseguiu chegar aqui. o interpretador do java e louco e pede"
				+ "esse retorno que nunca sera usadado";
	};
}
