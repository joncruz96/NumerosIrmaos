package main;

import java.util.Arrays;
import java.util.List;

public class NumerosIrmaos {

	public int descobrirNumIrmaos(String value) {
		
		String maiorNumero = new String();
		
		/* Dividir a String em um Array */
		String split[] = value.split("(?!^)");
		
		/* Incluir cada posição do Array a uma lista */
		List<String> listaDeNumeros = Arrays.asList(split);
		
		/* Realizar a ordenação decrescente dos valores da lista */
		listaDeNumeros.sort((a, b) -> b.compareTo(a));
		
		/* Adicionar o valor ordenado para o maiorNumero */
        for (String numero : listaDeNumeros)
        	maiorNumero = maiorNumero.concat(numero);
		
        try {
        	return Integer.valueOf(maiorNumero);
        } catch (IllegalArgumentException e) {
        	throw new IllegalArgumentException("O valor informado possui caracteres inválidos. "
        			+ "Por favor insira um número válido.");
        }
	}
	
}
