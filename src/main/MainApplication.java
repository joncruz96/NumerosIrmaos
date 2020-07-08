package main;

public class MainApplication {

	public static void main(String[] args) {
		
		String numero = "2946324";
		
		System.out.println("Informe um número para obter o número de irmãos que ele tem:\n");
		System.out.println("Numero informado: " + numero);
		
		System.out.println("\nO maior número é: " +  new NumerosIrmaos().descobrirNumIrmaos(numero) );
		
	}

}
