
public class Escopo{
	
	public static void main (String[] args) {
		double price = 100.00;
		
		if(price < 200.00){
			double discount = price* 0.01;
			
		}
		
		System.out.println(price);
		System.out.println(discount); //fora do escopo - erro de compilação
	}
}

