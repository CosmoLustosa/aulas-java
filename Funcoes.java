
import java.util.Scanner;

public class Funcoes{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		
		sc.close();
		
		int num = maior(a, b, c);
		imprimeMaior(num);
		
	}
	
	public static int maior(int x, int y, int z){ //funcao que retorna o maior de tres
		int aux;
		if(x > y && x > z){
			aux = x;
		}else if(y > z){
			aux = y;
		}else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void imprimeMaior(int maior){ //funcao que imprime
		System.out.println(maior);
		
	}
}

