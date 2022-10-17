package q4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class q4 {

	public static void main(String[] args) {
		 
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	    System.out.println("dd/MM/yyyy HH:mm-> "+dtf4.format(LocalDateTime.now()));
	}

}
