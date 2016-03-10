import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Test4 {
	public static void main(String[] args) throws IOException {
		System.out.println("BEGIN");
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:/study/testData/num2.txt"));
		Random rand = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != 100) {
			set.add(rand.nextInt(10000));
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			writer.write(String.valueOf(it.next()));
			writer.newLine();
		}
		writer.flush();
		writer.close();
		System.out.println("END");
	}
}
