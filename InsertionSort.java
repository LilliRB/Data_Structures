
public class InsertionSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		Insertion_Sort(array);
		print(array);
	}
	private static void Insertion_Sort(int [] array) {
		for(int i=1;i<array.length;i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0&&array[j]>key) {
				array[j+1] = array[j];
				j= j-1;
			}
			 array[j+1] = key;
		}
		
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
