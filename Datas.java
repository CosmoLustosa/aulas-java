import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.time.Instant;
import java.util.TimeZone;

public class Datas {
	
	public static void main (String[] args) throws ParseException {
				
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));//Configura o time zone
		
		
		Date d1 = new Date(); //parametros vazio pega a data atual do sistema
		Date d2 = new Date(System.currentTimeMillis()); //tambem pega a data ataul
		Date d3 = new Date(0L); //passando a quantidade de milissegundos
		Date d4 = new Date(1000000L);
		Date iso = Date.from(Instant.parse("2018-06-23T15:08:30Z")); //formato ISO 8601
				
		Date dd = data1.parse("24/04/2019");//imprime a string no formato passado como parametro
		Date dd2 = data2.parse("23/04/2019 11:17:45");		
		System.out.println(dd);
		System.out.println(dd2);
		
		System.out.println();
		System.out.println("*********  SEM FORMATAÇÃO  ************");
		System.out.println("Data atual " + d1);
		System.out.println("Data atual 2 " + d2);
		System.out.println("Data 1 " + dd);
		System.out.println("Data 2 " + dd2);						
		System.out.println("Data pelo milissegundo passado " + d3);
		System.out.println("Data 2 pelo milissegundo passado " + d4);
		System.out.println("Data pelo formato ISO 8601 " + iso);
		
		//formatando a data		
		System.out.println();
		System.out.println("*********  UTC TIME ZONE  ************");
		System.out.println("Data atual " + data2.format(d1));
		System.out.println("Data atual 2 " + data2.format(d2));
		System.out.println("Data 1 " + data1.format(dd));
		System.out.println("Data 2 " + data2.format(dd2));						
		System.out.println("Data pelo milissegundo passado " + data2.format(d3));
		System.out.println("Data 2 pelo milissegundo passado " + data2.format(d4));
		System.out.println("Data pelo formato ISO 8601 " + data2.format(iso));
		
		System.out.println();
		System.out.println("*********  GMT TIME ZONE  ************");
		System.out.println("Data atual " + data3.format(d1));
		System.out.println("Data atual 2 " + data3.format(d2));
		System.out.println("Data 1 " + data3.format(dd));
		System.out.println("Data 2 " + data3.format(dd2));
		System.out.println("Data pelo milissegundo passado " + data3.format(d3));
		System.out.println("Data 2 pelo milissegundo passado " + data3.format(d4));
		System.out.println("Data pelo formato ISO 8601 " + data3.format(iso));		
	}
}

