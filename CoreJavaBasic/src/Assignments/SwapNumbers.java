package Assignments;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=12, second=15;
		System.out.println("************Before Swap**************");
		System.out.println("First Number : "+first);
		System.out.println("Second Number : "+second);
		
		int temp=first;
		
		first=second;
		
		second=temp;
		
		System.out.println("*******************After Swap********************");
		System.out.println("First Number : "+first);
		System.out.println("Second Number : "+second);
	}

}
