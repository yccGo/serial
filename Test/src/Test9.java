import java.text.SimpleDateFormat;
import java.util.Date;

public class Test9 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd E hh:mm:ss");
		System.out.println(sdf.format(date));
	}
}
