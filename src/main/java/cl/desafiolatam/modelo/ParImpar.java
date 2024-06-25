package cl.desafiolatam.modelo;

public class ParImpar {
	
public int getParImpar(int num) {
		
		Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		return numeros[num];	
	}
	
	public String getNumeroParImpar(int num) {
		
		if (num % 2 == 0) {
			return "El número " +  num  + " Es Par";
		} else {
			return "El número " +  num  + " Es ImPar";
		}
	}

}
