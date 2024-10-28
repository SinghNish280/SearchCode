package practiceDemo;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,25,8,19,28};
		
		int n=a.length;
		
		for(int i=0;i<n-1; i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
				
				int temp = a[j];
				a[j]= a[j+1];
				a[j+1]=temp;
				
			}
		}

	}
		System.out.println(Arrays.toString(a));

}
	
}
