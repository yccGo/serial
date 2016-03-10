
public class Test10 {
	public static void main(String[] args) {
		long begin = System.nanoTime();
		Rabbit rabbit = new Rabbit();
		Turtle turtle = new Turtle();
		rabbit.start();
		turtle.start();
	}
}
