import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Calendario {
	
	public static void main (String[] args) throws ParseException{
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //formata data
		Date d = Date.from(Instant.parse("2019-04-29T12:47:30Z"));
		
		System.out.println(data.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); //adiciona unidades de tempo ao calendario
		
		d = cal.getTime(); //recebe nova data
		
		System.out.println(data.format(d));
		
		System.out.println("*********************");
		//recebendo uma unidade de tempo
		
		int minuto = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: "+ minuto);
		System.out.println("Mês: " + mes) ;
		
		
		
	}
}

