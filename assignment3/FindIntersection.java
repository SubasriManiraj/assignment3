package assignment3;

public class FindIntersection {
	public static void main(String[] args) {
		//declaring array a
		int[] a= {3,2,11,4,6,7};
		//declaring array b
		int[] b= {1,2,8,4,9,7};
		//for loop condition
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				//condition statement to find intersection
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	

}
