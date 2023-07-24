import java.util.Scanner;

class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter any Number:");

		int num= scn.nextInt();
		int count=0;

		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				count++;	
		}
		if(count==2)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not prime");
	}
}
