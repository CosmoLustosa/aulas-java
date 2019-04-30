import java.util.Scanner;


public class Vetores{
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		double[] vetor = new double[num]; //novo vetor
		double soma = 0;
		
		for(int i = 0; i < num; i++){
			
			vetor[i] = sc.nextDouble();
		}		
		sc.close();	
		
		for(int i = 0; i < num; i++){
			
			soma+= vetor[i];
		}
		
		
		System.out.println("Média: " + soma/num);	

        System.out.printf("Usando Printf - Média: %.4f%n", soma/num);
	}
}

