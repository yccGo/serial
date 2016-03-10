import java.util.Random;

public class Test5 {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i =0;i < 100;i++){
			int n = rand.nextInt(10);
			System.out.println(n);
		}
	}
}
