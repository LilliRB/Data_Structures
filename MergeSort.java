
public class MergeSort {

	public static void main(String[] args) {
	int [] array = {10,9,8,7,6,5,4,3,2,1};
	int [] T = new int[array.length];
	Mergesort(array,T, 0, array.length-1);
	print(array);
	}
	private static int [] Merge(int [] A, int [] T, int left,int right) {
		int k = left;
		int mid = (right+left)/2;
		int i=left;
		int j = mid+1;
		while(i<=mid&&j<=right) {
			if(A[i]<=A[j]) {
				T[k++] = A[i++];
			}
			else {
				T[k++] = A[j++];
			}
		}
        while (i <= mid) {
            T[k++] = A[i++];
        }
        while (j <= right) {
            T[k++] = A[j++];
        }
        for (i = left; i <= right; i++) {
            A[i] = T[i];
        }
        return A;
		
	}
	private static int [] Mergesort(int [] A,int [] T,int left,int right) {
		  if( left < right) {
		    int mid = (left + right)/2;
		    Mergesort(A,T,left,mid);
		    Mergesort(A,T,mid+1,right);
		    Merge(A,T,left,right);
		}
		  return A;
	}
	private static void print(int []array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
}
