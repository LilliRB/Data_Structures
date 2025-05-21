
public class RecursiveSelectionSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		SelectionSort(array,0);
		print(array);
	}
	private static int[] SelectionSort(int [] array,int i) {
		if(i==array.length) {
			return array;
		}
		int min_index = i;
		for(int j=i+1;j<array.length;j++) {
			if(array[j]<array[min_index]) {
				min_index = j;
			}
		}
		int temp = array[i];
		array[i] = array[min_index];
		array[min_index] = temp;
		return SelectionSort(array,i+1);
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
