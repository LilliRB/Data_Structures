
public class BubbleSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		Bubble_Sort(array);
		print(array);
	}
	private static void Bubble_Sort(int [] array) {
		boolean switched = true;
		while(switched == true) {
			switched = false;
		for(int i =0;i<array.length-1;i++) {
				if(array[i]>array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					switched = true;
			}
		}
		}
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
