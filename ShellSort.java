
public class ShellSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		Shell_Sort(array);
		print(array);
	}
	private static void Shell_Sort(int [] array) {
		for(int gap = array.length/2;gap>0;gap =gap/2) {
		for(int i=gap;i<array.length;i++) {
			int key = array[i];
			int j = i;
			while(j>=gap&&array[j-gap]>key) {
				array[j] = array[j-gap];
			     j-=gap;
			}
			 array[j] = key;
			
		}
		}
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
