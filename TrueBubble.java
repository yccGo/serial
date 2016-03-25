package cn.edu.cust.bubble;

public class TrueBubble {
	public static void showArray(int[] array){
		for(int num : array){
			System.out.print(num + "\t");
		}
	}
	public static void main(String[] args) {
		int[] array = {1,2,9,3,4};
		for(int i = 1;i <= array.length - 1;i++){
			boolean sorted = true;
			for(int j = 0;j < array.length - i;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					sorted = false;
				}
			}
			if(sorted){
				break;
			}
		}
		showArray(array);
	}
}
