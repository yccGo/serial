
public class Test8 {
	public static void main(String[] args) {
		String str = "abcdabc";
		char[] charArray = str.toCharArray();
		char ch = charArray[0]; 
		for(int i = 1;i < charArray.length;i++){
			ch ^= charArray[i];
		}
		System.out.println(ch);
	}
}
