
public class RecursiveInsertionSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		InsertionSort(array,1);
		print(array);
	}
	private static int[] InsertionSort(int [] array,int i) {
		if(i == array.length) {
			return array;
		}
		int key = array[i];
		int j = i-1;
		while(j>=0&&array[j]>key) {
			array[j+1] = array[j];
			j = j-1;
		}
		array[j+1]=key;
		return InsertionSort(array,i+1);
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
