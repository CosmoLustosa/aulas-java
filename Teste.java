import java.util.Scanner;

public class Teste{
	
	public static void main (String[] args){
		
		System.out.println("Entre com um número qualquer!");

		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if( number % 2 == 0)
			System.out.println("Número par!");
		else
			System.out.println("Número ímpar!");
		
		
		
		
		sc.close();
		
	}
}

