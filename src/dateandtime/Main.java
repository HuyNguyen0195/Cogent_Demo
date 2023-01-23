package dateandtime;
import java.time.LocalDateTime;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt=  LocalDateTime.now();
		int dd = ldt.getDayOfMonth();
		int mm = ldt.getMonthValue();
		int yy = ldt.getYear();
		System.out.printf("\n%d:%d:%d",dd,mm,yy);

	}

}
