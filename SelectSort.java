package cn.edu.cust.bubble;

public class SelectSort {
	public static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	public static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 5, 9, 2, 3, 18,12 };
		boolean flag = false;
		for (int i = 0; i < array.length - 1; i++) {
			int maxIdx = 0;
			flag = false;
			for (int j = 1; j < array.length - i; j++) {
				if (array[maxIdx] < array[j]) {
					System.out.println("array[maxIdx] array[j] => " + array[maxIdx] + " < " + array[j]);
					maxIdx = j;
				}
			}
			System.out.println("maxIdx : " + maxIdx);
			if (maxIdx != (array.length - i - 1)) {
				swap(array, array.length - i - 1, maxIdx);
				flag = true;
				showArray(array);
			}
			/*if(!flag){
				break;
			}*/
		}
		showArray(array);
	}

}
