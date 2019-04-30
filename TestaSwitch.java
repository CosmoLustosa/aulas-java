/*
 * função split() quebra uma string recebendo como parametro o caractere delimitador 
 * no exemplo usamos o caractere de espaço para delimitar cada final de string* 
 * 
 * 
 * */
import java.util.Scanner;

public class TestaSwitch{
	
	public static void main(String[] args){
		Scanner escolha = new Scanner(System.in);
		int x = escolha.nextInt();
		escolha.close();
		String dia = "";
		
		switch(x){
			case 1: dia = "domingo";
			break;
			
			case 2: dia = "segunda";
			break;
			
			case 3: dia = "terça";
			break;
			
			case 4: dia = "quarta";
			break;
			
			case 5: dia = "quinta";
			break;
			
			case 6: dia = "sexta";
			break;
			
			case 7: dia = "sábado";
			break;
			
			default: 
			System.out.println("Opção Inválida!");
		} 
						
		System.out.println(dia);
		
	}
}

