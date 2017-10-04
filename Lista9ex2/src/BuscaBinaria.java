import static org.junit.Assert.*;
import static org.mockito.*;

public class BuscaBinaria {
	public static void main (String[] args){
		int[] arrayOrdenado = {1, 3, 4, 6, 7, 8, 10, 13, 14};
		
		//testando o melhor caso
		assertEquals(1, BuscaBinaria(7, arrayOrdenado ));
		//testando o pior caso (numero inexistente)
		assertEquals(5, BuscaBinaria(2, arrayOrdenado));
		
	}
	public static int BuscaBinaria(int numeroProcurado, int[] arrayOrdenado){
		int meio;     
        int inicio = 0;     
        int fim = arrayOrdenado.length-1;  
        int quantidadeDeLoops=0;
        while (inicio <= fim) {     
                 meio = (inicio + fim)/2;     
                 if (numeroProcurado == arrayOrdenado[meio])     
                          return quantidadeDeLoops;     
                 if (numeroProcurado < arrayOrdenado[meio])     
                          fim = meio - 1;     
                 else     
                          inicio = meio + 1;     
        }     
        return quantidadeDeLoops; 
	}

}
