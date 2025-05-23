
public class QuickSort {

	public static void main(String[] args) {
		int [] array = {10,9,8,7,6,5,4,3,2,1};
		quickSort(array,0,array.length-1);
		print(array);

	}
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
    private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
