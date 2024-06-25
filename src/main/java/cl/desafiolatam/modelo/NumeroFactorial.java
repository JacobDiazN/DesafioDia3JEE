package cl.desafiolatam.modelo;

public class NumeroFactorial {
	
	public int getNumeros(int num) {
		
		Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Retorna los numeros;
		return numeros[num];
		

	}
	
	public int getNumeroFactorial(int num) {
		
		int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        return factorial;
	}
	
}
