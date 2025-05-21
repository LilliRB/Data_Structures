
public class RecursiveBubbleSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		int n = array.length;
		BubbleSort(array,n);
		print(array);

	}
	private static int [] BubbleSort(int [] array,int n) {
		if(n<0) {
			return array;
		}
		for(int i =0;i<n-1;i++) {
				if(array[i]>array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		return BubbleSort(array,n-1);
		}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}

