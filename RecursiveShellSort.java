
public class RecursiveShellSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		int gap = array.length/2;
		ShellSort(array,gap);
		print(array);
	}
	private static int [] ShellSort(int [] array,int gap) {
		if(gap==0) {
			return array;
		}
		for(int i=gap;i<array.length;i++) {
			int key = array[i];
			int j = i;
			while(j>=gap&&array[j-gap]>key) {
				array[j] = array[j-gap];
			     j-=gap;
			}
			 array[j] = key;
			
		}
		return ShellSort(array,gap/2);
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
