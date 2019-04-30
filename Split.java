/*
 * função split() quebra uma string recebendo como parametro o caractere delimitador 
 * no exemplo usamos o caractere de espaço para delimitar cada final de string* 
 * 
 * 
 * */
public class Split{
	
	public static void main(String[] args){
		String original = "limao laranja feijao milho goiaba";
		String vec[] = original.split(" "); //argumento é o delimitador de cada frase - no caso, o espaço
		String palavra1 = vec[0];
		String palavra2 = vec[1];
		String palavra3 = vec[2];
		String palavra4 = vec[3];
		String palavra5 = vec[4];
		
		
		System.out.println(palavra1);
		System.out.println(palavra2);
		System.out.println(palavra3);
		System.out.println(palavra4);
		System.out.println(palavra5);
	}
}

