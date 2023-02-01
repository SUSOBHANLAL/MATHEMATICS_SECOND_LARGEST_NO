import java.util.Arrays;

public class susobhan {
	public static void main(String args[]) {
		int arr[] = {1,1,2,55,88,0,2,4,5,6,6,7,8,9,22,23,44,11,24};
		Arrays.sort(arr);
		int arr1[] = new int[90];
		int n= arr.length;
		int j =0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr1[j]= arr[i];
				j++;
			}
			
		}
		
		arr1[j++]=arr[n-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		// print the second largest number
		int position =2;
		int index_position = position-1;
		
		
		System.out.print("the third laargest no is the "+arr1[index_position]);
	}

}
