
public class SelectionSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		Selection_Sort(array);
		print(array);

	}
	private static void Selection_Sort(int [] array) {
		for(int i=0;i<array.length;i++) {
			
			int min_index = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min_index]) {
					min_index = j;
				}
			}
			int temp = array[i];
			array[i]= array[min_index];
			array[min_index] = temp;
		}
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
