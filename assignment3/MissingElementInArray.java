package assignment3;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		//input
		int[] arr= {1,2,3,4,7,6,8};
		//sort array
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			int j=i+1;
			if(arr[i]!=j){
				System.out.println("Missing Number is " +j);
			
			break;
				
			
			}
		}
	}

}
