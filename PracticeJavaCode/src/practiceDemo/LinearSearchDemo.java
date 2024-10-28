package practiceDemo;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,8,9, 11, 14};
		
		int search = 14;
		boolean flag=false;
		
		for(int i=0; i<=a.length-1;i++) {
			
			if(a[i]==search) {
				System.out.println("Element found " +i);
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
		

	}

}
