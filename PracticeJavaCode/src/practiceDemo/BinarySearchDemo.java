package practiceDemo;

public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,6,9,10};
		
		int key = 9;
		boolean flag= false;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			
			int m= (l+h)/2;
			
			if(a[m]==key) {
				
				System.out.println("Element is found ");
				flag=true;
				 break;
			}
			
			if(a[m]<key) {
				
				l=m+1;
			}
			
			if(a[m]>key) {
				
				h=m-1;
			}
			
			
			
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		

	}

}
