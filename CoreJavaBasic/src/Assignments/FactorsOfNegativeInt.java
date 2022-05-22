package Assignments;

public class FactorsOfNegativeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -60;
		System.out.print("Factors of " + number + " are: ");

		for (int i = number; i <= Math.abs(number); i++) 
		{

			if (i == 0) {
				continue;
			} else 
			{
				if (number % i == 0) 
				{
					System.out.print(i + " ");
				}
			}
		}
	}

}
