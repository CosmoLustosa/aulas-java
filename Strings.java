
public class Strings{
	
	public static void main(String[] args){
		String original = " abcaaade FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); //tira os espaços da string
		String s04 = original.substring(5); //corta a string
		String s05 = original.substring(5, 9); //corta a string
		String s06 = original.replace('a', '2');
		String s07 = original.replace("abc", "blablabla");
		int i = original.indexOf("ab");
		int j = original.lastIndexOf("ab");
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(i);
		System.out.println(j);
	}
}

