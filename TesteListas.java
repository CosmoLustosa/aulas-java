import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class TesteListas{
	
	public static void main (String[] args) {
		List<String> nomes = new ArrayList<>();		
		nomes.add("Maria");
		nomes.add("Marcos");
		nomes.add("Mario");
		nomes.add("Manuel");
		nomes.add("Ana");		
		nomes.add(2, "Jaime");
		nomes.add(3, "Joana");	
	
		for(String nm : nomes){
			System.out.println(nm);
		}
		System.out.println("Tamanho da lista: " + nomes.size());
		
		nomes.remove(1); //remove o elemento da posição 1
		nomes.remove("asa"); //remove o elemento de texto igual
		
		System.out.println("=========================================");
		
		for(String nm : nomes){
			System.out.println(nm);
		}
		System.out.println("Tamanho da lista: " + nomes.size());
		
		nomes.removeIf(x -> x.charAt(0) == 'J'); //expressão lambda
		
		System.out.println("=========================================");
		
		for(String nm : nomes){
			System.out.println(nm);
		}
		System.out.println("Tamanho da lista: " + nomes.size());
		
		System.out.println("Índice de Ana: " + nomes.indexOf("Ana"));
		
		/*filtrando resultados */
		
		List<String> resultado = nomes.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for(String nm : resultado){
			System.out.println(nm);
		}
		System.out.println("Tamanho da lista: " + resultado.size());
		
		System.out.println("=========================================");	
			
		String busca = nomes.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
			
		System.out.println(busca);
			
		
	}
}

